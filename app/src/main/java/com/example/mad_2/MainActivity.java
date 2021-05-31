package com.example.mad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Switch aSwitch;
    RadioGroup radioGroup;
    RadioButton radioButton;
    CheckBox cb1,cb2,cb3;
    ArrayList<String> cbresult;
    Button submitBtn;
    Button moveBtn;
    Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move=(Button)findViewById(R.id.moveBtn);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,image.class);

            startActivity(intent);}
        });

        //SWITCH
        aSwitch = (Switch) findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    Toast.makeText(getBaseContext(),"Switch On",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getBaseContext(),"Switch Off",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //SPINNER
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.state, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        //RADIOBUTTON
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        //CHECKBOX
        cb1 = findViewById(R.id.chkbox1);
        cb2 = findViewById(R.id.chkbox2);
        cb3 = findViewById(R.id.chkbox3);

        submitBtn = findViewById(R.id.submitBtn);
        cbresult = new ArrayList<>();

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb1.isChecked())
                    cbresult.add("Heart Attack");
                else
                    cbresult.remove("Heart Attack");

            }

        });

        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb2.isChecked())
                    cbresult.add("Diabetes");
                else
                    cbresult.remove("Diabetes");
            }
        });

        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb3.isChecked())
                    cbresult.add("Tuberculosis");
                else
                    cbresult.remove("Tuberculosis");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s: cbresult)
                    stringBuilder.append(s).append("  ");
                //    stringBuilder.toString();
                //    StyleableToast.makeText(getBaseContext(), String.valueOf(stringBuilder),R.style.exampleToast).show();
                Toast.makeText(getBaseContext(), String.valueOf(stringBuilder),Toast.LENGTH_SHORT).show();

                //txtview8.setText(stringBuilder.toString());
                //txtview8.setEnabled(true);
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        Toast.makeText(this, (String) radioButton.getText(), Toast.LENGTH_SHORT).show();

    }

}