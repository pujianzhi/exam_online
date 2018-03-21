package com.examonline.common.entity;

public class Temp_SMD_Question {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private SMD_Questions smd_questions;
    private Teacher_Category teacher_category;
    private Courses courses;

    public SMD_Questions getSmd_questions() {
        return smd_questions;
    }

    public void setSmd_questions(SMD_Questions smd_questions) {
        this.smd_questions = smd_questions;
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
