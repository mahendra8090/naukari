package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import static maes.tech.intentanim.CustomIntent.customType;

public class QuestonMath extends AppCompatActivity {
    ArrayList<String> mathtopics=new ArrayList<>();
RecyclerView mathquestionsview;
RecyclerView.Adapter mathadapter;
RecyclerView.LayoutManager manager;
TextView Mname_topic_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queston_math);
        Mname_topic_id=(TextView)findViewById(R.id.name_topic_id);
        String st=getIntent().getStringExtra("key");
        String topic_name=getIntent().getStringExtra("topic_name");
        Mname_topic_id.setText(topic_name);
         mathquestionsview=(RecyclerView)findViewById(R.id.mathquestionslayout);

        manager = new LinearLayoutManager(QuestonMath.this,LinearLayoutManager.VERTICAL,false);
        mathquestionsview.setLayoutManager(manager);
        mathadapter = new mathquestionadapter(QuestonMath.this,st);
        mathquestionsview.setAdapter(mathadapter);










    }

    @Override
    public void finish() {
        super.finish();
        customType(QuestonMath.this,"right-to-left");
    }
}
