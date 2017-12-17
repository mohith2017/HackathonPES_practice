package com.example.mohith.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class page_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);
        ArrayList<stadium> words = new ArrayList<stadium>();
        words.add(new stadium("Chinnaswamy","Bangalore",30000,"Rainy",R.mipmap.chinna ));
        stadiumadapter sh = new stadiumadapter(this,0,words);
        ListView li=(ListView) findViewById(R.id.list123);
        li.setAdapter(sh);
    }
}

