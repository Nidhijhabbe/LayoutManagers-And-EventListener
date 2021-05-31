package com.example.mad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


public class toggle extends AppCompatActivity {


    ToggleButton togglebutton;
    TextView textview;
    Button move5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        move5=(Button)findViewById(R.id.moveBtn5);
        move5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(toggle.this,image2.class);

                startActivity(intent);}
        });

        togglebutton
                = (ToggleButton) findViewById(
                R.id.toggleButton1);

        textview
                = (TextView) findViewById(
                R.id.textView1);
    }

    public void onToggleClick(View view) {
        if (togglebutton.isChecked()) {
            textview.setText("Toggle is ON");
        } else {
            textview.setText("Toggle is OFF");
        }
    }
}