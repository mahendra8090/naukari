package com.example.administrator.nauraki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Previous_year_paper extends AppCompatActivity {
CardView c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_year_paper);
        c1=findViewById(R.id.p_c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i=new Intent(Previous_year_paper.this,downloadPrev.class);
i.putExtra("exam","1");
startActivity(i);
            }
        });
    }
}
