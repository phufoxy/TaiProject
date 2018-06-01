package com.example.vanphu.project_tai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.vanphu.project_tai.adapter.ghengoiAdapter;
import com.example.vanphu.project_tai.model.ghengoi;

import java.util.ArrayList;

public class ChairActivity extends AppCompatActivity {
    GridView gridview;
    ArrayList<ghengoi> arrayList;
    ghengoiAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Chọn Ghế Ngồi");
        setContentView(R.layout.activity_chair);
        init();
    }
    public void setGheNgoi(){
        arrayList.add(new ghengoi(1,"L1",1));
        arrayList.add(new ghengoi(2,"L2",1));
        arrayList.add(new ghengoi(3,"L3",0));
        arrayList.add(new ghengoi(4,"L4",0));
        arrayList.add(new ghengoi(5,"L5",0));
        arrayList.add(new ghengoi(6,"L6",0));
        arrayList.add(new ghengoi(7,"L7",0));
        arrayList.add(new ghengoi(8,"L8",0));
        arrayList.add(new ghengoi(9,"L9",1));
        arrayList.add(new ghengoi(10,"L10",1));
        arrayList.add(new ghengoi(11,"L11",1));
        arrayList.add(new ghengoi(12,"L12",1));
        arrayList.add(new ghengoi(13,"L13",0));
        arrayList.add(new ghengoi(14,"L14",1));
        arrayList.add(new ghengoi(15,"L15",1));
        arrayList.add(new ghengoi(16,"L16",0));
        arrayList.add(new ghengoi(17,"L17",1));
        arrayList.add(new ghengoi(18,"L18",1));
        arrayList.add(new ghengoi(19,"L19",1));
        arrayList.add(new ghengoi(20,"L20",0));

    }
    public void init(){
        gridview=findViewById(R.id.gridview);
        arrayList=new ArrayList<>();
        setGheNgoi();
        adapter=new ghengoiAdapter(this,R.layout.row_chair_item,arrayList);
        gridview.setAdapter(adapter);
    }
}
