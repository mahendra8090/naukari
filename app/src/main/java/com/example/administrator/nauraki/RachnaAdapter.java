package com.example.administrator.nauraki;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RachnaAdapter extends RecyclerView.Adapter<RachnaAdapter.ViewHolder> {

ArrayList<String> rachna_name=new ArrayList<>();
ArrayList<String> rachna_items=new ArrayList<>();

    public RachnaAdapter(Context c) {
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        Json_math j=new Json_math();
       st= j.getJSon1_titledata_rachna(c);
       rachna_name=st.get(0);
       rachna_items=st.get(1);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;

    public TextView rachnaname;
    public TextView rachnaitems;

    public ViewHolder(View itemView) {

        super(itemView);

        rachnaname = (TextView)itemView.findViewById(R.id.rachna_catagory);
        rachnaitems =
                (TextView)itemView.findViewById(R.id.rachna_item);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {


            }
        });
    }
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rachna_recycycler_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.rachnaname.setText(rachna_name.get(i).toString());
        viewHolder.rachnaitems.setText(rachna_items.get(i).toString());

    }

    @Override
    public int getItemCount() {
        return rachna_name.size();
    }
}