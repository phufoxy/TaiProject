package com.example.vanphu.project_tai.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.vanphu.project_tai.ChairActivity;
import com.example.vanphu.project_tai.R;
import com.example.vanphu.project_tai.model.tuyenduong;
import com.example.vanphu.project_tai.model.xebus;

import java.util.List;

/**
 * Created by VanPhu on 6/1/2018.
 */

public class xebusAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<xebus> xebusList;
    public xebusAdapter(Context context, int layout, List<xebus> xebusList) {
        this.context = context;
        this.layout = layout;
        this.xebusList = xebusList;
    }
    @Override
    public int getCount() {
        return xebusList.size();
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
        TextView txtXeBuyt,txtSoHieu,txtMaSoXe,txtSoGheTrong;
        Button btnDatGhe;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoler holder;
        if(view==null){
            holder=new ViewHoler();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            holder.txtXeBuyt=(TextView) view.findViewById(R.id.txtXeBuyt);
            holder.txtSoHieu=(TextView) view.findViewById(R.id.txtSoHieu);
            holder.txtMaSoXe=(TextView) view.findViewById(R.id.txtMaSoXe);
            holder.txtSoGheTrong=(TextView) view.findViewById(R.id.txtSoGheTrong);
            holder.btnDatGhe=(Button) view.findViewById(R.id.btnDatGhe);
            view.setTag(holder);
        }else {
            holder=(ViewHoler) view.getTag();
        }
        holder.txtXeBuyt.setText(xebusList.get(i).getXebuyt());
        holder.txtSoHieu.setText(xebusList.get(i).getSohieuxe());
        holder.txtMaSoXe.setText(xebusList.get(i).getMasoxe());
        holder.txtSoGheTrong.setText(xebusList.get(i).getSoghetrong());
        holder.btnDatGhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, ChairActivity.class));
            }
        });
        return view;
    }
}
