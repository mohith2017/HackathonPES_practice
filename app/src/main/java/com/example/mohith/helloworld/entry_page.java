package com.example.mohith.helloworld;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class entry_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_page);



        Spinner spinner5 = (Spinner) findViewById(R.id.spinner2);
        final Button button = (Button) findViewById(R.id.button2);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);
        final EditText name=(EditText)findViewById(R.id.editText3);
        final EditText email=(EditText)findViewById(R.id.editText4);



        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.type_array, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                button.setVisibility(View.VISIBLE);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            if (name.getText().toString().trim() != null || email.getText().toString().trim() != null) {
                                Intent i = new Intent(entry_page.this, filter_page.class);
                                startActivity(i);
                            } else if (name.getText().toString().trim() == null) {
                                name.setBackgroundColor(Color.RED);
                            } else if (email.getText().toString().trim() == null) {
                                email.setBackgroundColor(Color.RED);
                            } else {
                                Toast.makeText(getApplicationContext(), "One or more invalid inputs", Toast.LENGTH_LONG).show();
                            }

                    }
                });

            }
        });

    }
}
