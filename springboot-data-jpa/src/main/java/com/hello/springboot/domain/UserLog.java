package com.hello.springboot.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserLog implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int type;

    @Column
    private String details;

    @Column(nullable = false)
    private Long uid;

    @Column(unique = true)
    private Long ctime;

    public UserLog() {

    }

    public UserLog(int type, String details, Long uid, Long ctime) {
        this.type = type;
        this.details = details;
        this.uid = uid;
        this.ctime = ctime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
}
