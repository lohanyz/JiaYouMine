package com.jiayou.mine.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Mineinfo {

    @Id
    @GeneratedValue
    private int id;
    private int rq;        //日期
    private String zcid;    //主车id
    private String gcid;    //挂车id
    private double jz;      //净重
    private double mz;      //毛重
    private String dzkh;    //电子卡号
    private String sjxm;    //司机姓名
    private String hzh;     //护照号
    private String qfh;     //铅封号
    private String img;     //照片
    private int state;      //查阅状态
    public Mineinfo(){
    }

    public int getId() {
        return id;
    }

    public int getRq() {
        return rq;
    }

    public String getZcid() {
        return zcid;
    }

    public String getGcid() {
        return gcid;
    }

    public double getJz() {
        return jz;
    }

    public double getMz() {
        return mz;
    }

    public String getDzkh() {
        return dzkh;
    }

    public String getSjxm() {
        return sjxm;
    }

    public String getHzh() {
        return hzh;
    }

    public String getQfh() {
        return qfh;
    }

    public String getImg() {
        return img;
    }

    public int getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRq(int rq) {
        this.rq = rq;
    }

    public void setZcid(String zcid) {
        this.zcid = zcid;
    }

    public void setGcid(String gcid) {
        this.gcid = gcid;
    }

    public void setJz(double jz) {
        this.jz = jz;
    }

    public void setMz(double mz) {
        this.mz = mz;
    }

    public void setDzkh(String dzkh) {
        this.dzkh = dzkh;
    }

    public void setSjxm(String sjxm) {
        this.sjxm = sjxm;
    }

    public void setHzh(String hzh) {
        this.hzh = hzh;
    }

    public void setQfh(String qfh) {
        this.qfh = qfh;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setState(int state) {
        this.state = state;
    }
}
