package com.examonline.common.entity;

import java.util.Date;

public class FSP_Questions {
    private Integer id;

    private String question;

    private Integer questionType;

    private Integer teacherCategoryId;

    private Date pubdate;

    private String descrpt;

    private String option1;

    private String option1Answer;

    private String option2;

    private String option2Answer;

    private String option3;

    private String option3Answer;

    private String option4;

    private String option4Answer;

    private String option5;

    private String option5Answer;

    private Integer state;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getTeacherCategoryId() {
        return teacherCategoryId;
    }

    public void setTeacherCategoryId(Integer teacherCategoryId) {
        this.teacherCategoryId = teacherCategoryId;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getDescrpt() {
        return descrpt;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt == null ? null : descrpt.trim();
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1 == null ? null : option1.trim();
    }

    public String getOption1Answer() {
        return option1Answer;
    }

    public void setOption1Answer(String option1Answer) {
        this.option1Answer = option1Answer == null ? null : option1Answer.trim();
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2 == null ? null : option2.trim();
    }

    public String getOption2Answer() {
        return option2Answer;
    }

    public void setOption2Answer(String option2Answer) {
        this.option2Answer = option2Answer == null ? null : option2Answer.trim();
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3 == null ? null : option3.trim();
    }

    public String getOption3Answer() {
        return option3Answer;
    }

    public void setOption3Answer(String option3Answer) {
        this.option3Answer = option3Answer == null ? null : option3Answer.trim();
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4 == null ? null : option4.trim();
    }

    public String getOption4Answer() {
        return option4Answer;
    }

    public void setOption4Answer(String option4Answer) {
        this.option4Answer = option4Answer == null ? null : option4Answer.trim();
    }

    public String getOption5() {
        return option5;
    }

    public void setOption5(String option5) {
        this.option5 = option5 == null ? null : option5.trim();
    }

    public String getOption5Answer() {
        return option5Answer;
    }

    public void setOption5Answer(String option5Answer) {
        this.option5Answer = option5Answer == null ? null : option5Answer.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "FSP_Questions{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", questionType=" + questionType +
                ", teacherCategoryId=" + teacherCategoryId +
                ", pubdate=" + pubdate +
                ", descrpt='" + descrpt + '\'' +
                ", option1='" + option1 + '\'' +
                ", option1Answer='" + option1Answer + '\'' +
                ", option2='" + option2 + '\'' +
                ", option2Answer='" + option2Answer + '\'' +
                ", option3='" + option3 + '\'' +
                ", option3Answer='" + option3Answer + '\'' +
                ", option4='" + option4 + '\'' +
                ", option4Answer='" + option4Answer + '\'' +
                ", option5='" + option5 + '\'' +
                ", option5Answer='" + option5Answer + '\'' +
                ", state=" + state +
                ", userId=" + userId +
                '}';
    }
}