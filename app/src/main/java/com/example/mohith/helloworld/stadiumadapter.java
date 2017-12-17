package com.example.mohith.helloworld;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by K.S.LOHITH on 17-12-2017.
 */

public class stadiumadapter extends ArrayAdapter<stadium>{

    public stadiumadapter(Context context, int resource, ArrayList<stadium> objects) {
        super(context, 0, (List<stadium>) objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View stadiumview = convertView;
        if( stadiumview == null )
        {
            stadiumview = LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);
        }
        stadium currentstadium = getItem(position);

        TextView sheet = (TextView) stadiumview.findViewById(R.id.name3);
        sheet.setText(currentstadium.getName_of_stadium());
        TextView des = (TextView) stadiumview.findViewById(R.id.location3);
        des.setText("Venue:" + " " + currentstadium.getLocation());
        TextView img = (TextView) stadiumview.findViewById(R.id.cost3);
        img.setText("Cost:" + " " + Integer.toString(currentstadium.getCost()));
        TextView img1 = (TextView) stadiumview.findViewById(R.id.weather3);
        img1.setText("Weather:" + " " + currentstadium.getWeather());
        ImageView img2 = (ImageView) stadiumview.findViewById(R.id.image3);
        img2.setImageResource(currentstadium.getImage_id());

        return stadiumview;
    }
}


