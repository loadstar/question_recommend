package com.yftech.galileo;

import com.yftech.galileo.model.School;
import com.yftech.galileo.service.SchoolService;
import com.yftech.galileo.service.com.yftech.galileo.service.impl.SchoolServiceImpl;
import org.junit.Test;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/12/3
 * Time:13:35
 */
public class SchoolServiceTest extends SpringTestCase {
    @Autowired
    private SchoolService schoolService;
    Logger logger = Logger.getLogger(SchoolServiceTest.class);

    @Test
    public void selectSchoolByIdTest(){
        School school = schoolService.getSchoolById(3);
        logger.debug("school select result:"+school);
    }

    @Test
    public void selectSchools()
    {
        List<School> schoolList = schoolService.getSchools();
        logger.debug("school select result:"+schoolList);
    }

}
