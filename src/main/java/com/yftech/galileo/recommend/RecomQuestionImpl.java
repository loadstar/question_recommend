package com.yftech.galileo.recommend;

import org.apache.thrift.TException;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/11/29
 * Time:10:13
 */
public class RecomQuestionImpl implements StrategyRpcService.Iface{

    @Override
    public recomResponse recomQuestion(recomRequest recom_request) throws TException
    {
        recomResponse res = new recomResponse();

        if ( recom_request.getStudent_id() == 0 )
            res.questionNum = 100;
        else if (recom_request.getStudent_id() == 1)
            res.questionNum = 200;

        return res ;
    }
}
