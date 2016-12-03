package com.yftech.galileo;


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/12/3
 * Time:14:18
 */
//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestCase extends AbstractJUnit4SpringContextTests {
    protected Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
}

