package com.example.fitmewell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }
    public void onImageClick(View view) {
        // Handle click event here
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onMenClick(View view) {
        // Handle click event here
        Intent intent = new Intent(this, Men.class);
        startActivity(intent);
    }

    public void onWomenClick(View view) {
        // Handle click event here
        Intent intent = new Intent(this, Women.class);
        startActivity(intent);
    }

    public void onBack(View view) {
        Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
        startActivity(intent);
    }

    public void onShoesClick(View view) {
        Intent intent = new Intent(getApplicationContext(), Sneakers.class);
        startActivity(intent);
    }
}