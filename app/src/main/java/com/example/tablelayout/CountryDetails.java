package com.example.tablelayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CountryDetails extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);
        Intent intent = new Intent(this, MainActivity.class);
        button = findViewById(R.id.buttonNav);
        button.setOnClickListener(v -> _startActivity(intent) );
    }

    void _startActivity(Intent intent) {
        startActivity(intent);
        //finish();
    }
}