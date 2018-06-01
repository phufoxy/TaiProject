package com.example.vanphu.project_tai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vanphu.project_tai.adapter.xebusAdapter;
import com.example.vanphu.project_tai.model.xebus;

import java.util.ArrayList;

public class BusActivity extends AppCompatActivity {
    ListView listview;
    xebusAdapter adapter;
    ArrayList<xebus> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        init();
    }
    public void setXeBus(){
        arrayList.add(new xebus("xe buyet01","012","43A0","02"));
    }
    public void init(){
        listview=findViewById(R.id.listview);
        arrayList=new ArrayList<>();
        setXeBus();
        adapter=new xebusAdapter(this,R.layout.row_bus_item,arrayList);
        listview.setAdapter(adapter);
    }
}
