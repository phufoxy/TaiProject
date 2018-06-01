package com.example.vanphu.project_tai.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vanphu.project_tai.DatVeActivity;
import com.example.vanphu.project_tai.R;
import com.example.vanphu.project_tai.model.ghengoi;
import com.example.vanphu.project_tai.model.xebus;

import java.util.List;

/**
 * Created by VanPhu on 6/1/2018.
 */

public class ghengoiAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<ghengoi> ghengoiList;
    public ghengoiAdapter(Context context, int layout, List<ghengoi> ghengoiList) {
        this.context = context;
        this.layout = layout;
        this.ghengoiList = ghengoiList;
    }
    @Override
    public int getCount() {
        return ghengoiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHoler{
        TextView txtTenGhe;

    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoler holder;
        if(view==null){
            holder=new ViewHoler();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            holder.txtTenGhe=(TextView) view.findViewById(R.id.txtTenGhe);

            view.setTag(holder);
        }else {
            holder=(ViewHoler) view.getTag();
        }
        holder.txtTenGhe.setText(ghengoiList.get(i).getTenghe());

        int numberchair=ghengoiList.get(i).getId();
        if(i==numberchair || Integer.parseInt(String.valueOf(ghengoiList.get(i).getChonghe())) == 1){
            view.setBackgroundColor(Color.RED);
            holder.txtTenGhe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context,"Ghế Đã Đặt",Toast.LENGTH_LONG).show();
                }
            });
        }else{
            holder.txtTenGhe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(context, DatVeActivity.class));
                }
            });
        }

        return view;
    }
}
