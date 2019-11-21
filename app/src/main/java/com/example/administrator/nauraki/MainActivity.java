package com.example.administrator.nauraki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

import static maes.tech.intentanim.CustomIntent.customType;

public class MainActivity extends AppCompatActivity {
    LinearLayout upp_open;
    LinearLayout   Previous_open;;
  LinearLayout Sample_paper_open;
    LinearLayout Lakhpal_open;

    ArrayList<String> st=new ArrayList<>();
    LinearLayout uptet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1eMMgJqgVYO1_j0BzWH3scs6IcO0e1zEG"));
        startActivity(i);
Sample_paper_open= (LinearLayout) findViewById(R.id.sample_paper_open);
Previous_open= (LinearLayout) findViewById(R.id.previous_open);
        upp_open=(LinearLayout)findViewById(R.id.upp_open);
        Lakhpal_open = (LinearLayout) findViewById(R.id.lakhpal_open);

        uptet=(LinearLayout) findViewById(R.id.uptet);
        upp_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,UPP.class);
                startActivity(i);
                customType(MainActivity.this,"bottom-to-up");
            }
        });
        uptet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Uptet.class);
                startActivity(i);
                customType(MainActivity.this,"bottom-to-up");
            }
        });
        Sample_paper_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Sample_paper.class);
                startActivity(i);
                customType(MainActivity.this,"bottom-to-up");
            }
        });
        Previous_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,QuizActivity.class);
                startActivity(i);
                customType(MainActivity.this,"bottom-to-up");
            }
        });
        Lakhpal_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Lekhpal.class);
                startActivity(i);
                customType(MainActivity.this,"bottom-to-up");
            }
        });

    }



    }

