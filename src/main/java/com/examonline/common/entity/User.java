package com.examonline.common.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String eouNo;

    private String idCardNo;

    private String userName;

    private String passWord;

    private String mobile;

    private String homeTel;

    private String homeAddr;

    private String schAddr;

    private String qq;

    private String email;

    private Integer userType;

    private String gender;

    private Date birthday;

    private String nationPlace;

    private String marjor;

    private String eduBackground;

    private String graduateSchool;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEouNo() {
        return eouNo;
    }

    public void setEouNo(String eouNo) {
        this.eouNo = eouNo == null ? null : eouNo.trim();
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel == null ? null : homeTel.trim();
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr == null ? null : homeAddr.trim();
    }

    public String getSchAddr() {
        return schAddr;
    }

    public void setSchAddr(String schAddr) {
        this.schAddr = schAddr == null ? null : schAddr.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNationPlace() {
        return nationPlace;
    }

    public void setNationPlace(String nationPlace) {
        this.nationPlace = nationPlace == null ? null : nationPlace.trim();
    }

    public String getMarjor() {
        return marjor;
    }

    public void setMarjor(String marjor) {
        this.marjor = marjor == null ? null : marjor.trim();
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground == null ? null : eduBackground.trim();
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", eouNo='" + eouNo + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", mobile='" + mobile + '\'' +
                ", homeTel='" + homeTel + '\'' +
                ", homeAddr='" + homeAddr + '\'' +
                ", schAddr='" + schAddr + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", nationPlace='" + nationPlace + '\'' +
                ", marjor='" + marjor + '\'' +
                ", eduBackground='" + eduBackground + '\'' +
                ", graduateSchool='" + graduateSchool + '\'' +
                '}';
    }
}