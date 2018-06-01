package com.example.vanphu.project_tai.model;

/**
 * Created by VanPhu on 6/1/2018.
 */

public class tuyenduong {
    String tuyenduong;
    String tenduong;
    String khoangcach;
    String bendi;
    String bendo;
    String tansuat;
    String giave;
    String giomo;
    String giodong;

    public tuyenduong(String tuyenduong, String tenduong, String khoangcach, String bendi, String bendo, String tansuat, String giave, String giomo, String giodong) {
        this.tuyenduong = tuyenduong;
        this.tenduong = tenduong;
        this.khoangcach = khoangcach;
        this.bendi = bendi;
        this.bendo = bendo;
        this.tansuat = tansuat;
        this.giave = giave;
        this.giomo = giomo;
        this.giodong = giodong;
    }

    public String getTuyenduong() {
        return tuyenduong;
    }

    public void setTuyenduong(String tuyenduong) {
        this.tuyenduong = tuyenduong;
    }

    public String getTenduong() {
        return tenduong;
    }

    public void setTenduong(String tenduong) {
        this.tenduong = tenduong;
    }

    public String getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(String khoangcach) {
        this.khoangcach = khoangcach;
    }

    public String getBendi() {
        return bendi;
    }

    public void setBendi(String bendi) {
        this.bendi = bendi;
    }

    public String getBendo() {
        return bendo;
    }

    public void setBendo(String bendo) {
        this.bendo = bendo;
    }

    public String getTansuat() {
        return tansuat;
    }

    public void setTansuat(String tansuat) {
        this.tansuat = tansuat;
    }

    public String getGiave() {
        return giave;
    }

    public void setGiave(String giave) {
        this.giave = giave;
    }

    public String getGiomo() {
        return giomo;
    }

    public void setGiomo(String giomo) {
        this.giomo = giomo;
    }

    public String getGiodong() {
        return giodong;
    }

    public void setGiodong(String giodong) {
        this.giodong = giodong;
    }
}
