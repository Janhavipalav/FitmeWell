package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.button.MaterialButton;

public class InfoActivity extends AppCompatActivity {
    Button all,men,women,sneakers,hats;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        all = findViewById(R.id.all);
        men = findViewById(R.id.men);
        women = findViewById(R.id.women);
        sneakers = findViewById(R.id.sneakers);
        hats = findViewById(R.id.hats);


        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this, CategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });

        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this, CategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this, CategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sneakers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this, CategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });

        hats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this, CategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });

        findViewById(R.id.wardrobe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
            }
        });

        MaterialButton viewNowButton = findViewById(R.id.viewnow);
        viewNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this, ViewNowActivity.class);
                startActivity(intent);
            }
        });

    }
}