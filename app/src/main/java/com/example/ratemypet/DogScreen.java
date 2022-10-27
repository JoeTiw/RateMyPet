package com.example.ratemypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DogScreen extends AppCompatActivity {

    ImageView imgView;
    Button thumbDown, thumbUp;
    int i = 1;

    private int [] textureArrayWin = {R.drawable.first_dog, R.drawable.second_dog,R.drawable.third_dog,R.drawable.fourth_dog,R.drawable.fifth_dog};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_screen);


        imgView = findViewById(R.id.dogimageView);
        thumbDown = findViewById(R.id.thumbsDown);
        thumbUp = findViewById(R.id.thumbsUp);

        Button btnhelp = (Button) findViewById(R.id.btnhelp);
        Button btncats = (Button) findViewById(R.id.btncats);

        btncats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DogScreen.this, HomeScreen.class));
            }
        });


        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DogScreen.this, HelpPage.class));
            }
        });

        thumbDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView.setImageResource(textureArrayWin[i % 5]);
                i++;

            }

        });

        thumbUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                imgView.setImageResource(textureArrayWin[i % 5]);
                i++;

            }
        });


    }
}