package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button register, login;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register=(Button) findViewById(R.id.button2);
        login=(Button) findViewById(R.id.button);
        edt=(EditText) findViewById(R.id.editText);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,register.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            String name=edt.getText().toString();
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,login.class);
                intent.putExtra("manu",name);
                startActivity(intent);
            }
        });

    }
}
