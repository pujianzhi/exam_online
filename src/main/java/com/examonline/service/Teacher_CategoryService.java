package com.examonline.service;

import com.examonline.common.entity.Courses;
import com.examonline.common.entity.Teacher_Category;

import java.util.List;

public interface Teacher_CategoryService {
    List<Teacher_Category> getTeacher_CategorysByCourses(Courses courses);
}
