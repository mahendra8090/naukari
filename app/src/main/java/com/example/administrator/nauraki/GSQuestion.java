package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ActionMode;

import static maes.tech.intentanim.CustomIntent.customType;

public class GSQuestion extends AppCompatActivity {
RecyclerView Mgsquestionslayout;
RecyclerView.LayoutManager gslayoutmanager;
RecyclerView.Adapter gsquestionadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsquestion);
        Mgsquestionslayout=(RecyclerView)findViewById(R.id.gsquestionslayout);
        gslayoutmanager = new LinearLayoutManager(GSQuestion.this,LinearLayoutManager.VERTICAL,false);
        Mgsquestionslayout.setLayoutManager(gslayoutmanager);
        gsquestionadapter = new gsquestionadapter(GSQuestion.this,1);
        Mgsquestionslayout.setAdapter(gsquestionadapter);
    }

    @Override
    public void finish() {
        super.finish();
        customType(GSQuestion.this,"right-to-left");
    }
}
