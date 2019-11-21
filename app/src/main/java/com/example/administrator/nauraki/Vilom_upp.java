package com.example.administrator.nauraki;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static maes.tech.intentanim.CustomIntent.customType;

public class Vilom_upp extends AppCompatActivity {
RecyclerView vilomview;
    RecyclerView.LayoutManager vilomviewlayout;
    RecyclerView.Adapter adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vilom_upp);
       vilomview=(RecyclerView)findViewById(R.id.vilom_recycler_view);
        vilomviewlayout = new LinearLayoutManager(Vilom_upp.this,LinearLayoutManager.VERTICAL,false);
        vilomview.setLayoutManager(vilomviewlayout);
        adapter1 = new Vilom_adapter(Vilom_upp.this);
        vilomview.setAdapter(adapter1);
    }

    @Override
    public void finish() {
        super.finish();
        customType(Vilom_upp.this,"right-to-left");
    }
}
