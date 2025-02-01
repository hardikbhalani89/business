package com.myhome.business.model;

import java.sql.Timestamp;

public class UserDTO {

    private Integer userId;
    private String userName;
    private Integer userTypeCode;
    private Timestamp auditInsertDate;
    private String auditInsertProgram;
    private String auditInsertLogin;
    private Timestamp auditUpdateDate;
    private String auditUpdateProgram;


    private String auditUpdateLogin;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserTypeCode() {
        return userTypeCode;
    }

    public void setUserTypeCode(Integer userTypeCode) {
        this.userTypeCode = userTypeCode;
    }

    public Timestamp getAuditInsertDate() {
        return auditInsertDate;
    }

    public void setAuditInsertDate(Timestamp auditInsertDate) {
        this.auditInsertDate = auditInsertDate;
    }

    public String getAuditInsertProgram() {
        return auditInsertProgram;
    }

    public void setAuditInsertProgram(String auditInsertProgram) {
        this.auditInsertProgram = auditInsertProgram;
    }

    public String getAuditInsertLogin() {
        return auditInsertLogin;
    }

    public void setAuditInsertLogin(String auditInsertLogin) {
        this.auditInsertLogin = auditInsertLogin;
    }

    public Timestamp getAuditUpdateDate() {
        return auditUpdateDate;
    }

    public void setAuditUpdateDate(Timestamp auditUpdateDate) {
        this.auditUpdateDate = auditUpdateDate;
    }

    public String getAuditUpdateProgram() {
        return auditUpdateProgram;
    }

    public void setAuditUpdateProgram(String auditUpdateProgram) {
        this.auditUpdateProgram = auditUpdateProgram;
    }

    public String getAuditUpdateLogin() {
        return auditUpdateLogin;
    }

    public void setAuditUpdateLogin(String auditUpdateLogin) {
        this.auditUpdateLogin = auditUpdateLogin;
    }
}
