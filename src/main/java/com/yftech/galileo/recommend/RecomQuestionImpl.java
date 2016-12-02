package com.yftech.galileo.recommend;


import org.apache.thrift.TException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/11/29
 * Time:10:13
 */
public class RecomQuestionImpl implements StrategyRpcService.Iface{

    private static final int EXERCISE_NUM = 7;
    private static final int HOMEWORK_CHINESE_NUM = 20;  // 语文 20
    private static final int HOMEWORK_MATH_NUM = 30;  // 数学 30
    private static final int HOMEWORK_ENGLISH_NUM = 50;  // 英语 50
    private static final int HOMEWORK_OTHER_NUM = 5;  // 副科 20


    @Override
    public recomResponse recomQuestion(recomRequest recom_request) throws TException {
        recomResponse res = new recomResponse();

        res.questionNum = -1;

//        try {
//            // test 数据库jdbc连接,每次都要连接不太好，还是用mybatis可以
//            //要连接的数据库URL
//            String url = "jdbc:mysql://123.57.70.102:3306/yfjy_test";
//            //连接的数据库时使用的用户名
//            String username = "root";
//            //连接的数据库时使用的密码
//            String password = "yfjy_$$_%5579";
//
//            //1.加载驱动
//            Class.forName("com.mysql.jdbc.Driver");//推荐使用这种方式来加载驱动
//
//            //2.获取与数据库的链接
//            Connection conn = DriverManager.getConnection(url, username, password);
//            //3.获取用于向数据库发送sql语句的statement
//            Statement st = conn.createStatement();
//
//            String sql = "select * from school";
//            //4.向数据库发sql,并获取代表结果集的resultset
//            ResultSet rs = st.executeQuery(sql);
//
//            //5.取出结果集的数据
//            while (rs.next()) {
//                System.out.println("id=" + rs.getObject("id"));
//                System.out.println("name=" + rs.getObject("name"));
//                System.out.println("province_id=" + rs.getObject("province_id"));
//                System.out.println("city_id=" + rs.getObject("city_id"));
//                //System.out.println("birthday=" + rs.getObject("birthday"));
//            }
//
//            //6.关闭链接，释放资源
//            rs.close();
//            st.close();
//            conn.close();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            return  res;
//        }

        // 通过数据库获取预先设置的内容
        // 1. 不同科目题目数量，先写死

        double ratio = isBeforeExam()? 1.3 : 1;

        // 请求逻辑
        // 不同科目，所有科目： 0-主观题，1-客观题，映射在外面做吧
        // 不同科目的难度： 易0-0.3 中0.3-0.7 难0.7-0.99
        // 知识点id
        Random rand =new Random();
        switch (recom_request.getType().getValue()){
            case 2: //QueryType.EXERCISE:
                res.questionNum = (int)Math.ceil(EXERCISE_NUM * ratio); // 7 10 - 主观题 4 5
                for (int i = 0; i < Math.floor(res.questionNum/2+1); i++){
                    res.questions.add(new question(recom_request.getSubject_id(),0,rand.nextDouble(),2189));
                }
                for(int i = (int)Math.floor(res.questionNum/2+1); i < res.questionNum; i++){
                res.questions.add(new question(recom_request.getSubject_id(),-1,rand.nextDouble(),2189));
                }
                break;
            case 1: //QueryType.HOMEWORK:
                switch (recom_request.getSubject_id()){
                    case 26:
                    case 36: // 语文
                        res.questionNum = (int)Math.ceil(HOMEWORK_CHINESE_NUM*ratio); // 20 26

                        for (int i = 0; i < Math.floor(res.questionNum/2+1); i++){
                            res.questions.add(new question(recom_request.getSubject_id(),0,rand.nextDouble(),2189));
                        }

                        for(int i = (int)Math.floor(res.questionNum/2+1);i< res.questionNum; i++){
                            res.questions.add(new question(recom_request.getSubject_id(),-1, rand.nextDouble(), 2189));

                         }
                        break;
                    case 10:
                    case 20:
                    case 30: // 数学
                        res.questionNum = (int)Math.ceil(HOMEWORK_MATH_NUM*ratio); //30 39

                        break;
                    case 27:
                    case 37: // 英语
                        res.questionNum = (int)Math.ceil(HOMEWORK_ENGLISH_NUM*ratio); //50 65
                        break;
                    default://副科
                        res.questionNum = (int)Math.ceil(HOMEWORK_OTHER_NUM*ratio); //5 7
                }
                break;
            default:
                ;
        }

//        if ( recom_request.getStudent_id() == 0 )
//            res.questionNum = 100;
//        else if (recom_request.getStudent_id() == 1)
//            res.questionNum = 200;
        System.out.print("request: student_id="+recom_request.getStudent_id());
        return res ;
    }


    public boolean isBeforeExam(){
        // 是否在考试前两个月前
//        String data = getSystemTime();
//        int interval_of_date = daysBetween(data, "2016-12-5");
//        interval_of_date = daysBetween(data, "2016-11-5");
//        interval_of_date = daysBetween(data, "2015-11-5");
//        interval_of_date = daysBetween(data, "2017-11-5");
        int interval_of_date = daysBetween(getSystemTime(),"2016-6-5");
        return interval_of_date>0 ? (interval_of_date>61 ? false:true):false;
    }

    public String getSystemTime()
    {
        return new SimpleDateFormat("YY-MM-dd").format(new Date(System.currentTimeMillis()));
    }

    public int daysBetween(String current_date, String date_exam) {

        Date current = new Date();
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance();
        try {
            current = df.parse(current_date);
            date = df.parse(date_exam);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calst = java.util.Calendar.getInstance();
        java.util.Calendar caled = java.util.Calendar.getInstance();
        calst.setTime(current);
        caled.setTime(date);
        //设置时间为0时
        calst.set(java.util.Calendar.HOUR_OF_DAY, 0);
        calst.set(java.util.Calendar.MINUTE, 0);
        calst.set(java.util.Calendar.SECOND, 0);
        calst.set(Calendar.YEAR, 1970);

        caled.set(java.util.Calendar.HOUR_OF_DAY, 0);
        caled.set(java.util.Calendar.MINUTE, 0);
        caled.set(java.util.Calendar.SECOND, 0);
        caled.set(Calendar.YEAR, 1970);

        //得到两个日期相差的天数
        int days = ((int) (caled.getTime().getTime() / 1000) - (int) (calst
                .getTime().getTime() / 1000)) / 3600 / 24;

        return days;
    }

}
