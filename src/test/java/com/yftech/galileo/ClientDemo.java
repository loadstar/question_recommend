package com.yftech.galileo;

import com.yftech.galileo.recommend.QueryType;
import com.yftech.galileo.recommend.StrategyRpcService;
import com.yftech.galileo.recommend.recomRequest;
import com.yftech.galileo.recommend.recomResponse;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/11/29
 * Time:11:14
 */
public class ClientDemo {

    public static final String SERVER_IP = "123.56.116.4"; //"localhost";
    public static final int SERVER_PORT = 9966;
    public static final int TIMEOUT = 30000;

    public void startClient(int student_id) {
        TTransport transport = null;
        try{
            transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
            // 协议要和服务端一致:二进制
            TProtocol protocol = new TBinaryProtocol(transport);
            StrategyRpcService.Client client = new StrategyRpcService.Client(protocol);

            transport.open();

            recomRequest request = new recomRequest();
            request.setType(QueryType.HOMEWORK);
            //request.student_id = student_id;
            //request.subject_id = 0;
            //request.book_id = 0;
            request.setStudent_id(student_id);
            request.setBook_id(student_id);
            request.setSubject_id(student_id);

            recomResponse res = client.recomQuestion(request);
            System.out.println(res.getQuestionNum());

        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            if (null != transport) {
                transport.close();
            }
        }

    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        ClientDemo client = new ClientDemo();
        client.startClient(1);
    }

}
