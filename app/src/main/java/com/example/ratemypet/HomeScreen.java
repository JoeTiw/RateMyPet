package com.example.ratemypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomeScreen extends AppCompatActivity {

ImageView imgView;
Button thumbDown, thumbUp;
int i = 1;

private int [] textureArrayWin = {R.drawable.first_cat, R.drawable.second_cat,R.drawable.third_cat,R.drawable.fourth_cat,R.drawable.fifth_cat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button btndogs = (Button) findViewById(R.id.btndogs);
        Button btnhelp = (Button) findViewById(R.id.btnhelp);

        imgView = findViewById(R.id.catimageView);
        thumbDown = findViewById(R.id.thumbsDown);
        thumbUp = findViewById(R.id.thumbsUp);

        btndogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this, DogScreen.class));
            }
        });

        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this, HelpPage.class));
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