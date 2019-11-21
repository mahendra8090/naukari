package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static maes.tech.intentanim.CustomIntent.customType;

public class Paribhasalist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paribhasa);

        RecyclerView mkavi_recycler_id = (RecyclerView) findViewById(R.id.paribhasa_recycler_id);

       RecyclerView.LayoutManager kavi_layoutmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mkavi_recycler_id.setLayoutManager(kavi_layoutmanager);
       RecyclerView.Adapter kaviadapter=new Topic_list_adpater(this,5);
        mkavi_recycler_id.setAdapter(kaviadapter);

    }

    @Override
    public void finish() {
        super.finish();
        customType(Paribhasalist.this,"right-to-left");
    }
}
