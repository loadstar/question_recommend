package com.yftech.galileo.service.impl;

import com.yftech.galileo.dao.SchoolMapper;
import com.yftech.galileo.model.School;
import com.yftech.galileo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/12/3
 * Time:13:47
 */


@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;

    public School getSchoolById(int id){
        return schoolMapper.selectByPrimaryKey(id);
    }


//    public List<School> getSchools(){
//        return schoolMapper.selectAll();
//    }

}
