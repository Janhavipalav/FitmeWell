package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class generate5 extends AppCompatActivity {
    Button generatefive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate5);

        generatefive = findViewById(R.id.generatefive);

        generatefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generate5.this, generate6.class);
                startActivity(intent);
                finish();
            }
        });
    }
}