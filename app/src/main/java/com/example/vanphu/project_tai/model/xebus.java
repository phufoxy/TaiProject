package com.example.vanphu.project_tai.model;

/**
 * Created by VanPhu on 6/1/2018.
 */

public class xebus {
    String xebuyt;
    String sohieuxe;
    String masoxe;
    String soghetrong;

    public xebus(String xebuyt, String sohieuxe, String masoxe, String soghetrong) {
        this.xebuyt = xebuyt;
        this.sohieuxe = sohieuxe;
        this.masoxe = masoxe;
        this.soghetrong = soghetrong;
    }

    public String getXebuyt() {
        return xebuyt;
    }

    public void setXebuyt(String xebuyt) {
        this.xebuyt = xebuyt;
    }

    public String getSohieuxe() {
        return sohieuxe;
    }

    public void setSohieuxe(String sohieuxe) {
        this.sohieuxe = sohieuxe;
    }

    public String getMasoxe() {
        return masoxe;
    }

    public void setMasoxe(String masoxe) {
        this.masoxe = masoxe;
    }

    public String getSoghetrong() {
        return soghetrong;
    }

    public void setSoghetrong(String soghetrong) {
        this.soghetrong = soghetrong;
    }
}
