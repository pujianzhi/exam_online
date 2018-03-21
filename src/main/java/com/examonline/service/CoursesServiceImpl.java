package com.examonline.service;

import com.examonline.common.entity.Courses;
import com.examonline.common.entity.CoursesExample;
import com.examonline.mapper.CoursesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    CoursesMapper coursesMapper;

    @Override
    public List<Courses> getAllCourses() {
        CoursesExample coursesExample = new CoursesExample();
        return coursesMapper.selectByExample(coursesExample);
    }
}
