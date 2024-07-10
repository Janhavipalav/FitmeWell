package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sneakers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneakers);
    }

    public void onFabClick(View view) {
        Intent intent = new Intent(getApplicationContext(), UploadActivity.class);
        startActivity(intent);
    }
}