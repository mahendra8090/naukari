package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static maes.tech.intentanim.CustomIntent.customType;

public class Rachna extends AppCompatActivity {
RecyclerView mkavi_recycler_id;
RecyclerView.LayoutManager kavi_layoutmanager;
RecyclerView.Adapter kaviadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rachna);
        mkavi_recycler_id=(RecyclerView)findViewById(R.id.kavi_recycler_id);

        kavi_layoutmanager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mkavi_recycler_id.setLayoutManager(kavi_layoutmanager);
        kaviadapter=new Topic_list_adpater(this,4);
        mkavi_recycler_id.setAdapter(kaviadapter);
    }

    @Override
    public void finish() {
        super.finish();
        customType(Rachna.this,"right-to-left");
    }
}
