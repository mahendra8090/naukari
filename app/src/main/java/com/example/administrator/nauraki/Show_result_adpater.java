package com.example.administrator.nauraki;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Show_result_adpater extends RecyclerView.Adapter<Show_result_adpater.ViewHolder> {
ArrayList<String> question_array=new ArrayList<>();

    ArrayList<String> your_ans_array=new ArrayList<>();
    ArrayList<String> correct_ans_array=new ArrayList<>();


    Context mcontext;
ArrayList<Boolean> check= new ArrayList<>();
    public Show_result_adpater(Context c,ArrayList<String> q,ArrayList<String> y_ans,ArrayList<String> correct_ans) {
        question_array=q;
        your_ans_array=y_ans;
        correct_ans_array=correct_ans;
        mcontext=c;

    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;

        public TextView correct_ans;
        public TextView your_ans;


        public TextView question;

        public ViewHolder(View itemView) {
        super(itemView);
        question = (TextView)itemView.findViewById(R.id.show_result_item_question_id);
        your_ans = (TextView)itemView.findViewById(R.id.show_result_item_your_ans_id);
        correct_ans = (TextView)itemView.findViewById(R.id.show_result_item_correct_ans_id);
       // mcheckBox=(CheckBox)itemView.findViewById(R.id.checkBox);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

            }
        });


    }
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.show_result_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.question.setText(question_array.get(i).toString());
        viewHolder.your_ans.setText(your_ans_array.get(i).toString());
        viewHolder.correct_ans.setText(correct_ans_array.get(i).toString());

    }

    @Override
    public int getItemCount() {
        return question_array.size();
    }
}