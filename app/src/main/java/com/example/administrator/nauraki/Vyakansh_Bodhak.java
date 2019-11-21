package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static maes.tech.intentanim.CustomIntent.customType;

public class Vyakansh_Bodhak extends AppCompatActivity {
RecyclerView Mvyakansh_recycler;
RecyclerView.LayoutManager vyakansh_recycler_manager;
RecyclerView.Adapter vyakansh_recycler_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vyakansh__bodhak);

        Mvyakansh_recycler=(RecyclerView)findViewById(R.id.vyakansh_recycler);
        vyakansh_recycler_manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        Mvyakansh_recycler.setLayoutManager(vyakansh_recycler_manager);
        vyakansh_recycler_adapter=new vyakanshAdapter(this);
        Mvyakansh_recycler.setAdapter(vyakansh_recycler_adapter);

    }

    @Override
    public void finish() {
        super.finish();
        customType(Vyakansh_Bodhak.this,"right-to-left");
    }
}
