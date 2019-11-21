package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowResult extends AppCompatActivity {
RecyclerView mShow_result_recycler;
    RecyclerView.LayoutManager mShow_layout_manager;
    RecyclerView.Adapter mAdapter;
    ArrayList<String> question_array=new ArrayList<>();

    ArrayList<String> your_ans_array=new ArrayList<>();
    ArrayList<String> correct_ans_array=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);


        question_array=getIntent().getStringArrayListExtra("question");
        your_ans_array=getIntent().getStringArrayListExtra("your_ans");
        correct_ans_array=getIntent().getStringArrayListExtra("correct_ans");

      mShow_result_recycler=findViewById(R.id.show_result_recycler);
        mShow_layout_manager = new LinearLayoutManager(ShowResult.this,LinearLayoutManager.VERTICAL,false);
        mShow_result_recycler.setLayoutManager(mShow_layout_manager);
        mAdapter = new Show_result_adpater(ShowResult.this,question_array,your_ans_array,correct_ans_array);
        mShow_result_recycler.setAdapter(mAdapter);
         }

}
