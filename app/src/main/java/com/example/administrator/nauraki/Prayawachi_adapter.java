package com.example.administrator.nauraki;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Prayawachi_adapter extends RecyclerView.Adapter<Prayawachi_adapter.ViewHolder> {
Context mcontext;
ArrayList<String> st=new ArrayList<>();
    public Prayawachi_adapter(Context c) {
        mcontext=c;
        Json_math j=new Json_math();
   st=j.getJSon1_titledata_prayawachi(mcontext);

    }


    class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;

    public TextView sabd;
    public TextView vilom;

    public ViewHolder(View itemView) {

        super(itemView);

        sabd = (TextView)itemView.findViewById(R.id.id_praya);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {


            }
        });
    }
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.prayawachilayout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.sabd.setText(st.get(i).toString());


    }

    @Override
    public int getItemCount() {
        return st.size();
    }
}