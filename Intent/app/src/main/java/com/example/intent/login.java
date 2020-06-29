package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt=(TextView) findViewById(R.id.textView);
        String nam= getIntent().getStringExtra("manu");
        txt.setText("Welcome to home"+nam);

    }
}
