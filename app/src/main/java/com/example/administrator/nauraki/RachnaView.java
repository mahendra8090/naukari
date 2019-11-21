package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import static maes.tech.intentanim.CustomIntent.customType;

public class RachnaView extends AppCompatActivity {
TextView definition;
    RecyclerView mkaviview_recycler_id;
    RecyclerView.LayoutManager kaviview_layoutmanager;
    RecyclerView.Adapter kaviviewadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rachna_view);

        String topic_name=getIntent().getStringExtra("topic_name");
        String key=getIntent().getStringExtra("key");
        definition=(TextView)findViewById(R.id.kaviname);
definition.setText(topic_name);
mkaviview_recycler_id=findViewById(R.id.recyclerview_rachna);
        kaviview_layoutmanager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mkaviview_recycler_id.setLayoutManager(kaviview_layoutmanager);
        kaviviewadapter=new RachnaAdapter(this);
        mkaviview_recycler_id.setAdapter(kaviviewadapter);

    }

    @Override
    public void finish() {
        super.finish();
        customType(RachnaView.this,"right-to-left");
    }
}
