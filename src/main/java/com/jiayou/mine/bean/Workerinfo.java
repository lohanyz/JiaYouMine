package com.jiayou.mine.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Workerinfo {
    @Id
    @GeneratedValue
    private int id;
    private String wid;
    private String wname;
    private String wpwd;
    public Workerinfo(){};

    public void setId(int id) {
        this.id = id;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public void setWpwd(String wpwd) {
        this.wpwd = wpwd;
    }

    public int getId() {
        return id;
    }

    public String getWid() {
        return wid;
    }

    public String getWname() {
        return wname;
    }

    public String getWpwd() {
        return wpwd;
    }
}
