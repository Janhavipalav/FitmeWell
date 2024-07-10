package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class generate4 extends AppCompatActivity {
    Button generatefour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate4);
        generatefour =  findViewById(R.id.generatefour);

        generatefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generate4.this, generate5.class);
                startActivity(intent);
                finish();
            }
        });
    }
}