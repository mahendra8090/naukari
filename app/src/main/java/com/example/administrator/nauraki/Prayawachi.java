package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static maes.tech.intentanim.CustomIntent.customType;

public class Prayawachi extends AppCompatActivity {
RecyclerView prayawachiview;
    RecyclerView.LayoutManager vilomviewlayout;
    RecyclerView.Adapter adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayawachi);
        prayawachiview=(RecyclerView)findViewById(R.id.prayawachi_recycler_view);
        vilomviewlayout = new LinearLayoutManager(Prayawachi.this,LinearLayoutManager.VERTICAL,false);
        prayawachiview.setLayoutManager(vilomviewlayout);
        adapter1 = new Prayawachi_adapter(Prayawachi.this);
        prayawachiview.setAdapter(adapter1);
    }

    @Override
    public void finish() {
        super.finish();
        customType(Prayawachi.this,"right-to-left");
    }
}
