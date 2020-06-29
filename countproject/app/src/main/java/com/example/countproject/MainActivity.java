package com.example.countproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4;
Integer count=0;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView )findViewById(R.id.txt);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count+=1;
                txt.setText(""+count);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count-=1;
                txt.setText(""+count);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                txt.setText(""+count);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"count is"+count,Toast.LENGTH_SHORT).show();
            }
        });
        if(savedInstanceState!=null){
            Integer i=savedInstanceState.getInt("manu");
            count=i;
            txt.setText(""+count);



        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("manu",count);
    }
}
