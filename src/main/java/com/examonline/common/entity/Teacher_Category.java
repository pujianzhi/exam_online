package com.examonline.common.entity;

public class Teacher_Category {
    private Integer id;

    private String teacherCategoryName;

    private Integer courseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherCategoryName() {
        return teacherCategoryName;
    }

    public void setTeacherCategoryName(String teacherCategoryName) {
        this.teacherCategoryName = teacherCategoryName == null ? null : teacherCategoryName.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}