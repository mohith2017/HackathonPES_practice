package com.example.mohith.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Login_initial extends AppCompatActivity {
TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_initial);

        t=(TextView)findViewById(R.id.textView2);

        t.setText("Let's rock on!!!!");
    }
}
