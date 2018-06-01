package com.example.vanphu.project_tai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vanphu.project_tai.adapter.tuyenduongAdapter;
import com.example.vanphu.project_tai.model.tuyenduong;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    tuyenduongAdapter adapter;
    ArrayList<tuyenduong> arrayTuyenDuong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void setTuyenDuong(){
        arrayTuyenDuong.add(new tuyenduong("01","Tôn đức thắng","20 km","Quảng Nam","Đà nẵng","12km/h","50k","6:30","17:30"));
        arrayTuyenDuong.add(new tuyenduong("01","Tôn đức thắng","20 km","Quảng Nam","Đà nẵng","12km/h","50k","6:30","17:30"));
        arrayTuyenDuong.add(new tuyenduong("01","Tôn đức thắng","20 km","Quảng Nam","Đà nẵng","12km/h","50k","6:30","17:30"));
        arrayTuyenDuong.add(new tuyenduong("01","Tôn đức thắng","20 km","Quảng Nam","Đà nẵng","12km/h","50k","6:30","17:30"));
        arrayTuyenDuong.add(new tuyenduong("01","Tôn đức thắng","20 km","Quảng Nam","Đà nẵng","12km/h","50k","6:30","17:30"));

    }

    public void init(){
        listview=findViewById(R.id.listview);
        arrayTuyenDuong=new ArrayList<>();
        setTuyenDuong();
        adapter=new tuyenduongAdapter(this,R.layout.row_route_item,arrayTuyenDuong);
        listview.setAdapter(adapter);
    }
}
