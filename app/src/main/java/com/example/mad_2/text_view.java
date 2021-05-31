package com.example.mad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class text_view extends AppCompatActivity {

    EditText editTextName;
    Button btnClickHere;
    TextView textName;
    Button move4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        move4=(Button)findViewById(R.id.moveBtn4);
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(text_view.this,imagebtn.class);

                startActivity(intent);}
        });
        editTextName = (EditText)findViewById(R.id.editTextName);
        btnClickHere = (Button)findViewById(R.id.btnClickHere);
        textName = (TextView)findViewById(R.id.textName);

        btnClickHere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                textName.setText("Hi " + name);
            }
        });
    }
}