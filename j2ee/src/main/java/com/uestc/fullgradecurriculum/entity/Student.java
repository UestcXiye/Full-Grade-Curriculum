package com.uestc.fullgradecurriculum.entity;

import java.math.BigInteger;

/**
 * @author Amaris
 */
public class Student {

    private BigInteger studentId;
    private String name;
    private String studentNumber;
    private String password;
    private String openId;
    private String tenantKey;
    private String sessionKey;

    public Student() {
    }

    public Student(BigInteger studentId, String name, String studentNumber, String password, String openId, String tenantKey, String sessionKey) {
        this.studentId = studentId;
        this.name = name;
        this.studentNumber = studentNumber;
        this.password = password;
        this.openId = openId;
        this.tenantKey = tenantKey;
        this.sessionKey = sessionKey;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", password='" + password + '\'' +
                ", openId='" + openId + '\'' +
                ", tenantKey='" + tenantKey + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                '}';
    }

    public BigInteger getStudentId() {
        return studentId;
    }

    public void setStudentId(BigInteger studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getTenantKey() {
        return tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
}
