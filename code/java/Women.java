package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Women extends AppCompatActivity {
    Button generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);
    }
    public void onFabClick(View view) {
        Intent intent = new Intent(getApplicationContext(), UploadActivity.class);
        startActivity(intent);

        generate = findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Women.this, generate1.class);
                startActivity(intent);
            }
        });
    }
}