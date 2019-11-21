package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.LineNumberReader;

import static maes.tech.intentanim.CustomIntent.customType;

public class Anekarthi extends AppCompatActivity {
  RecyclerView anekarthi_recyclerview;
  RecyclerView.LayoutManager anekarthi_layoutmanager;
  RecyclerView.Adapter anekarthiadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anekarthi);
        anekarthi_recyclerview=(RecyclerView)findViewById(R.id.anekarthirecyclerview);
        anekarthi_layoutmanager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        anekarthi_recyclerview.setLayoutManager(anekarthi_layoutmanager);
        anekarthiadapter=new anekarthi_adapter(this);
        anekarthi_recyclerview.setAdapter(anekarthiadapter);

    }

    @Override
    public void finish() {
        super.finish();
        customType(Anekarthi.this,"right-to-left");
    }
}
