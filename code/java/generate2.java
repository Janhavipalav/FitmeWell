package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class generate2 extends AppCompatActivity {
    Button generatetwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate2);

        generatetwo = findViewById(R.id.generatetwo);

        generatetwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generate2.this, generate3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}