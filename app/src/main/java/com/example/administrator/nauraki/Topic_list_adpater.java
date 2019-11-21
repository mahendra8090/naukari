package com.example.administrator.nauraki;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static maes.tech.intentanim.CustomIntent.customType;

public class Topic_list_adpater extends RecyclerView.Adapter<Topic_list_adpater.ViewHolder> {
ArrayList<String> topic_st=new ArrayList<>();
    Intent intent;
Context mcontext;
int mKey;

    public Topic_list_adpater(Context c,int key) {


        mcontext=c;
        mKey=key;
        GetArray g=new GetArray();
       switch (key){
           case 1:
           {
               topic_st=g.getMathlist();
              intent =new Intent(mcontext,QuestonMath.class);
               break;
           }
           case 2:
           {
               topic_st=g.getGslist();
               intent =new Intent(mcontext,GSQuestion.class);
               break;
           }
           case 3:
           {
               topic_st=g.getReasoninglist();
               intent =new Intent(mcontext,ReasoningQuestion.class);
               break;
           }
           case 4:
           {
               topic_st=g.getKavi_name();
               intent =new Intent(mcontext,RachnaView.class);
               break;

           }
           case 5:
           {
               topic_st=g.getParibhasa_list();
               intent =new Intent(mcontext,ParibhasaDetail.class);
               break;

           }


       }

    }

    class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;


        TextView topic;

        public ViewHolder(View itemView) {
        super(itemView);

       topic = (TextView) itemView.findViewById(R.id.topic_name_id);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext, "present  "+getAdapterPosition(), Toast.LENGTH_SHORT).show();
                int j=getAdapterPosition();

                intent.putExtra("key",""+j);
                intent.putExtra("topic_name",topic_st.get(j));
                mcontext.startActivity(intent);
                customType(mcontext,"left-to-right");
            }
        });
       }}


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        final int j =i;
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.topic_list_layout, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);

                return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.topic.setText(topic_st.get(i).toString());

    }

    @Override
    public int getItemCount() {
        return topic_st.size();

    }
}