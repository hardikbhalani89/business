package com.myhome.business.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table (name="user")
public class User {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_typ_cd")
    private Integer userTypeCode;

    @Column(name = "audit_insert_dt")
    private Timestamp auditInsertDate;

    @Column(name = "audit_insert_pgm")
    private String auditInsertProgram;

    @Column(name = "audit_insert_login")
    private String auditInsertLogin;

    @Column(name = "audit_update_dt")
    private Timestamp auditUpdateDate;

    @Column(name = "audit_update_pgm")
    private String auditUpdateProgram;

    @Column(name = "audit_update_login")
    private String auditUpdateLogin;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserTypeCode() {
        return userTypeCode;
    }

    public void setUserTypeCode(Integer userTypeCode) {
        this.userTypeCode = userTypeCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
