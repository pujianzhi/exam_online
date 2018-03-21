package com.examonline.common.entity;

import java.util.Date;

public class Stu_Score {
    private Integer id;

    private Double score;

    private Date testDate;

    private String descrpt;

    private Integer userId;

    private String examNo;

    private Double fspScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getDescrpt() {
        return descrpt;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt == null ? null : descrpt.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo == null ? null : examNo.trim();
    }

    public Double getFspScore() {
        return fspScore;
    }

    public void setFspScore(Double fspScore) {
        this.fspScore = fspScore;
    }
}