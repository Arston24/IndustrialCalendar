package com.example.vsysuev.industrialcalendar;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class Adapter extends ArrayAdapter<Date>{
    List<Date> contactList;
    Context context;
    private LayoutInflater mInflater;

    public Adapter(@NonNull Context context, @NonNull List<Date> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        contactList = objects;
    }

    @Nullable
    @Override
    public Date getItem(int position) {
        return contactList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);

    }
}
