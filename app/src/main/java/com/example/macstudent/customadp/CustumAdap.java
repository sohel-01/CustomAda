package com.example.macstudent.customadp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustumAdap extends BaseAdapter {
    MainActivity mainActivity;
    String []files;

    public CustumAdap(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        this.files = files;
    }

    @Override
    public int getCount() {
        return files.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater linflater = LayoutInflater.from(mainActivity);
        View view = linflater.inflate(R.layout.custom_view,null);
        return view;
    }
}
