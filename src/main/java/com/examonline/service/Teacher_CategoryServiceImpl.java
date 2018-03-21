package com.examonline.service;

import com.examonline.common.entity.Courses;
import com.examonline.common.entity.Teacher_Category;
import com.examonline.common.entity.Teacher_CategoryExample;
import com.examonline.mapper.Teacher_CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Teacher_CategoryServiceImpl implements  Teacher_CategoryService {

    @Autowired
    Teacher_CategoryMapper teacher_categoryMapper;

    @Override
    public List<Teacher_Category> getTeacher_CategorysByCourses(Courses courses) {
        Teacher_CategoryExample teacher_categoryExample = new Teacher_CategoryExample();
        Teacher_CategoryExample.Criteria criteria = teacher_categoryExample.createCriteria();
        criteria.andCourseIdEqualTo(courses.getId());
        return teacher_categoryMapper.selectByExample(teacher_categoryExample);
    }
}
