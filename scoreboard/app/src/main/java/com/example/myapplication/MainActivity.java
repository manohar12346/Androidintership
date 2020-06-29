package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
Button a1,a2,a3,b1,b2,b3,rest;
TextView txta,txtb;
Integer counta=0,countb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1=(Button) findViewById(R.id.aone);
        a2=(Button) findViewById(R.id.atwo);
        a3=(Button) findViewById(R.id.athree);
        b1=(Button) findViewById(R.id.bone);
        b2=(Button) findViewById(R.id.btwo);
        b3=(Button) findViewById(R.id.bthree);
        txta=(TextView) findViewById(R.id.a0);
        txtb=(TextView) findViewById(R.id.b0);
        rest=(Button) findViewById(R.id.reset);
       a1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               counta+=1;
               txta.setText(""+counta);
           }
       });
       a2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               counta+=2;
               txta.setText(""+counta);
           }
       });
       a3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               counta+=3;
               txta.setText(""+counta);
           }
       });
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               countb+=1;
               txtb.setText(""+countb);
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               countb+=2;
               txtb.setText(""+countb);
           }
       });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               countb+=3;
               txtb.setText(""+countb);
           }

       });
       rest.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               counta=0;
               Toast.makeText(MainActivity.this,"s",Toast.LENGTH_LONG).show();
               countb=0;
               txta.setText(""+counta);
               txtb.setText(""+countb);
           }
       });
       if(savedInstanceState!=null){
            Integer i=savedInstanceState.getInt("manua");
            Integer j=savedInstanceState.getInt("manub");
            counta=i;
            countb=j;
            txta.setText(""+i);
            txtb.setText(""+j);
        }


    }




    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("manua",counta);
        outState.putInt("manub",countb);
    }
}
