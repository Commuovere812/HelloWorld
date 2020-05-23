package com.example.demo.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.demo.R;

public class MyListAdapter extends BaseAdapter {
    private Context mCpntext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context) {
        this.mCpntext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_cpntent);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvTitle.setText("this is title");
        holder.tvTime.setText("2099-9-9");
        holder.tvContent.setText("this is content");
        Glide.with(mCpntext).load("https://iknow-pic.cdn.bcebos.com/64380cd7912397dd33747efb5f82b2b7d1a287c4?x-bce-process=image/resize,m_lfit,w_600,h_800,limit_1").into(holder.imageView);
        return convertView;
    }
}
