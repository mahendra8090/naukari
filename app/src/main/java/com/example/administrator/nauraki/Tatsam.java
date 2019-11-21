package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static maes.tech.intentanim.CustomIntent.customType;

public class Tatsam extends AppCompatActivity {
RecyclerView tatsam_recyclerviewview;
RecyclerView.LayoutManager tatsam_layoutmanager;
RecyclerView.Adapter tatsam_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatsam);
        tatsam_recyclerviewview=(RecyclerView)findViewById(R.id.tatsam_recyclerviewview);
        tatsam_layoutmanager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        tatsam_recyclerviewview.setLayoutManager(tatsam_layoutmanager);
        tatsam_adapter=new Tatsam_adapter(this);
        tatsam_recyclerviewview.setAdapter(tatsam_adapter);
    }

    @Override
    public void finish() {
        super.finish();
        customType(Tatsam.this,"right-to-left");
    }
}
