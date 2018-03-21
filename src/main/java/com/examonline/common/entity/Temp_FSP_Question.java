package com.examonline.common.entity;

public class Temp_FSP_Question {
    private Integer id;
    private FSP_Questions fsp_questions;
    private Teacher_Category teacher_category;
    private Courses courses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FSP_Questions getFsp_questions() {
        return fsp_questions;
    }

    public void setFsp_questions(FSP_Questions fsp_questions) {
        this.fsp_questions = fsp_questions;
    }

    public Teacher_Category getTeacher_category() {
        return teacher_category;
    }

    public void setTeacher_category(Teacher_Category teacher_category) {
        this.teacher_category = teacher_category;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
}
