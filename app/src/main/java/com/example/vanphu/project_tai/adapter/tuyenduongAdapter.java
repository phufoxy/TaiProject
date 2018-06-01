package com.example.vanphu.project_tai.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vanphu.project_tai.BusActivity;
import com.example.vanphu.project_tai.R;
import com.example.vanphu.project_tai.model.tuyenduong;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VanPhu on 6/1/2018.
 */

public class tuyenduongAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<tuyenduong> tuyenduongList;

    public tuyenduongAdapter(Context context, int layout, List<tuyenduong> tuyenduongList) {
        this.context = context;
        this.layout = layout;
        this.tuyenduongList = tuyenduongList;
    }

    @Override
    public int getCount() {
        return tuyenduongList.size();
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
        TextView txtTuyenDuong,txtTenDuong,txtKhoangCach,txtBenDi,txtBenDo,txttansuat,txtGiaVe,txtGioMo,txtGioDong;
        Button btnTimGhe;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoler holder;
        if(view==null){
            holder=new ViewHoler();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            holder.txtTuyenDuong=(TextView) view.findViewById(R.id.txtTuyenDuong);
            holder.txtTenDuong=(TextView) view.findViewById(R.id.txtTenDuong);
            holder.txtKhoangCach=(TextView) view.findViewById(R.id.txtKhoangCach);
            holder.txtBenDi=(TextView) view.findViewById(R.id.txtBenDi);
            holder.txtBenDo=(TextView) view.findViewById(R.id.txtBenDo);
            holder.txttansuat=(TextView) view.findViewById(R.id.txttansuat);
            holder.txtGiaVe=(TextView) view.findViewById(R.id.txtGiaVe);
            holder.txtGioMo=(TextView) view.findViewById(R.id.txtGioMo);
            holder.txtGioDong=(TextView) view.findViewById(R.id.txtGioDong);
            holder.btnTimGhe=(Button) view.findViewById(R.id.btnTimGhe);
            view.setTag(holder);
        }else {
            holder=(ViewHoler) view.getTag();
        }
        holder.txtTuyenDuong.setText(tuyenduongList.get(i).getTuyenduong());
        holder.txtTenDuong.setText(tuyenduongList.get(i).getTenduong());
        holder.txtKhoangCach.setText(tuyenduongList.get(i).getKhoangcach());
        holder.txtBenDi.setText(tuyenduongList.get(i).getBendi());
        holder.txtBenDo.setText(tuyenduongList.get(i).getBendo());
        holder.txttansuat.setText(tuyenduongList.get(i).getTansuat());
        holder.txtGiaVe.setText(tuyenduongList.get(i).getGiave());
        holder.txtGioMo.setText(tuyenduongList.get(i).getGiomo());
        holder.txtGioDong.setText(tuyenduongList.get(i).getGiodong());
        holder.btnTimGhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, BusActivity.class));
            }
        });
        return view;
    }
}
