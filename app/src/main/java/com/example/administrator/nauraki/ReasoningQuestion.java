package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import static maes.tech.intentanim.CustomIntent.customType;

public class ReasoningQuestion extends AppCompatActivity {
  RecyclerView reasoning_recyclerview;
  TextView Mreasoning_topic_name_id;
  RecyclerView.LayoutManager reasoning_layout_manager;
  RecyclerView.Adapter reasoning_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reasoning_question);
        String topicname=getIntent().getStringExtra("topic_name");
        String key=getIntent().getStringExtra("key");
Mreasoning_topic_name_id=(TextView)findViewById(R.id.reasoning_topic_name_id);
Mreasoning_topic_name_id.setText(topicname);
        reasoning_recyclerview = (RecyclerView) findViewById(R.id.reasoning_recyclerview);
        reasoning_layout_manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        reasoning_recyclerview.setLayoutManager(reasoning_layout_manager);
        reasoning_adapter=new reasoningquestionadapter(this,key);
        reasoning_recyclerview.setAdapter(reasoning_adapter);

    }

    @Override
    public void finish() {
        super.finish();
        customType(ReasoningQuestion.this,"right-to-left");
    }
}
