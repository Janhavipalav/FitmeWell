package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class generate3 extends AppCompatActivity {
    Button generatethree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate3);

        generatethree = findViewById(R.id.generatethree);

        generatethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generate3.this, generate4.class);
                startActivity(intent);
                finish();
            }
        });
    }
}