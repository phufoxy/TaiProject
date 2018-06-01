package com.example.vanphu.project_tai.model;

/**
 * Created by VanPhu on 6/1/2018.
 */

public class ghengoi {
    int id;
    String tenghe;
    int chonghe;

    public ghengoi(int id, String tenghe, int chonghe) {
        this.id = id;
        this.tenghe = tenghe;
        this.chonghe = chonghe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenghe() {
        return tenghe;
    }

    public void setTenghe(String tenghe) {
        this.tenghe = tenghe;
    }

    public int getChonghe() {
        return chonghe;
    }

    public void setChonghe(int chonghe) {
        this.chonghe = chonghe;
    }
}
