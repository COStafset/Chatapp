package com.example.cloyster23.chatapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/**
 * Created by Cloyster23 on 18.09.2016.
 */
public class kontaktAdapter extends ArrayAdapter<Kontakt> {
    public kontaktAdapter(Context context, ArrayList<Kontakt> Kontakter) {
        super(context ,  0, Kontakter);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Kontakt kontakt = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_kontakt, parent, false);
        }
        TextView tvContactName = (TextView) convertView.findViewById(R.id.tvContactName);
        tvContactName.setText(kontakt.getUsername());
        return convertView;
    }
}

