package com.yftech.galileo.recommend;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/11/29
 * Time:10:20
 */
public class RecomQuestionService {
    public static final int SERVER_PORT = 9966;
    private static String THRIFT_PROPERTIES = "properties/thrift_rpc.properties";

    //PropertyConfigurator.configure("properties/log4j.properties");
    //private static final Log LOG = LogFactory.getLog(RecomQuestionService.class);
    private static Logger logger = Logger.getLogger(RecomQuestionService.class.getName());

    public void startServer(){

        //int port = context.getInt("recommend.query.thrift.port", 9966);

//        InputStream input = RecomQuestionService.class.getClassLoader()
//                .getResourceAsStream(THRIFT_PROPERTIES);


        try{
//            Properties p = new Properties();
//            p.load(input);
//            String str = p.getProperty("recommend.query.thrift.port");
//            int port = Integer.parseInt(str);

            System.out.println("RecomQuestionService start ....");
            logger.info("RecomQuestionService start ....");

            // 使用二进制来编码应用层的数据
            TBinaryProtocol.Factory proFactory = new TBinaryProtocol.Factory();

            // 使用普通的socket来传输数据
            TServerSocket serverTransport = new TServerSocket(SERVER_PORT);

            // 线程池服务模型，使用标准的阻塞式IO
            TProcessor processor = new StrategyRpcService.Processor<StrategyRpcService.Iface>( new RecomQuestionImpl());

            TThreadPoolServer.Args ttpsArgs = new TThreadPoolServer.Args(serverTransport);
            ttpsArgs.processor(processor);
            ttpsArgs.protocolFactory(proFactory);

            TServer server = new TThreadPoolServer(ttpsArgs);
            System.out.println("Start server on port "+SERVER_PORT+"...");
            logger.info("Start server on port " + SERVER_PORT+"...");

            server.serve();
        }
        catch (Exception e){
            System.out.println("Server start error!!!");
            logger.error("Start server on port " + SERVER_PORT+" error!!!");
            e.printStackTrace();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        RecomQuestionService server = new RecomQuestionService();
        server.startServer();
    }
}