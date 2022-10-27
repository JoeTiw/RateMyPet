package com.example.ratemypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);

       //Button btndogs = (Button) (findViewById(R.id.btndogs));
        Button btncats = (Button) findViewById(R.id.btncats);
        Button btndogs = (Button) findViewById(R.id.btndogs);

        btncats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelpPage.this, HomeScreen.class));
            }
        });

        btndogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelpPage.this, DogScreen.class));
            }
        });

    }
}