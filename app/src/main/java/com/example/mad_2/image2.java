package com.example.mad_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class image2 extends AppCompatActivity {
    Button button;
    View screenView;
    int[] back_images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image2);
        back_images = new int[]{R.drawable.a, R.drawable.b,
                R.drawable.c, R.drawable.d};
        button = findViewById(R.id.Button);
        screenView = findViewById(R.id.relative_layout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // fetching length of array
                int array_length = back_images.length;

                // object creation of random class
                Random random = new Random();

                // generation of random number
                int random_number = random.nextInt(array_length);

                // set background images on screenView
                // using setBackground() method.
                screenView.setBackground(ContextCompat.getDrawable(getApplicationContext(), back_images[random_number]));
            }
        });
    }
}