package com.example.administrator.nauraki;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class mathquestionadapter extends RecyclerView.Adapter<mathquestionadapter.ViewHolder> {
    ArrayList<String> st1=new ArrayList<>();
    ArrayList<String> st2=new ArrayList<>();
    ArrayList<String> st3=new ArrayList<>();
    ArrayList<String> st4=new ArrayList<>();
    ArrayList<String> st5=new ArrayList<>();
    ArrayList<String> st6=new ArrayList<>();
    ArrayList<ArrayList<String>> math=new ArrayList<>();
    public mathquestionadapter(Context c,String i) {
        Json_math j=new Json_math();
       math= j.getJSon1_titledata_math(c,i);
        st1=math.get(0);
        st2=math.get(1);
        st3=math.get(2);
        st4=math.get(3);
        st5=math.get(4);
        st6=math.get(5);

    }

    class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;

    public TextView question;
    public TextView option1;
        public TextView option2;
        public TextView option3;
        public TextView option4;
        public TextView ans;


    public ViewHolder(View itemView) {
        super(itemView);

       question = (TextView)itemView.findViewById(R.id.questionid);
        option1 =
                (TextView)itemView.findViewById(R.id.option1_id);
        option2 = (TextView)itemView.findViewById(R.id.option2_id);
        option3 =
                (TextView)itemView.findViewById(R.id.option3_id);
        option4 = (TextView)itemView.findViewById(R.id.option4_id);
        ans = (TextView)itemView.findViewById(R.id.answer_id);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {


            }
        });
    }
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.mathquestionlayout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.question.setText(st1.get(i).toString());
        viewHolder.option1.setText(st2.get(i).toString());
        viewHolder.option2.setText(st3.get(i).toString());
        viewHolder.option3.setText(st4.get(i).toString());
        viewHolder.option4.setText(st5.get(i).toString());
        viewHolder.ans.setText(st6.get(i).toString());

    }

    @Override
    public int getItemCount() {
        return st1.size();
    }
}