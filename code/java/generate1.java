package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class generate1 extends AppCompatActivity {
    Button generateone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate1);

        generateone = findViewById(R.id.generateone);

        generateone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generate1.this, generate2.class);
                startActivity(intent);
                finish();
            }
        });



        // Load images dynamically


        // Add more code to load additional images as needed
    }

}