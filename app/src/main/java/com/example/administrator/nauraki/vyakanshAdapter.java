package com.example.administrator.nauraki;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class vyakanshAdapter extends RecyclerView.Adapter<vyakanshAdapter.ViewHolder> {

ArrayList<String> sabd_st=new ArrayList<>();
    ArrayList<String> vilom_st=new ArrayList<>();

    public vyakanshAdapter(Context c) {
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        Json_math j=new Json_math();
       st= j.getJSon1_titledata_vyakansh(c);
       sabd_st=st.get(0);
       vilom_st=st.get(1);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;

    public TextView sabd;
    public TextView vilom;

    public ViewHolder(View itemView) {

        super(itemView);

        sabd = (TextView)itemView.findViewById(R.id.vyakansh_sabd_id);
        vilom =
                (TextView)itemView.findViewById(R.id.vyakansh_vyakansh_id);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {


            }
        });
    }
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.vyakansh_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.sabd.setText(sabd_st.get(i).toString());
        viewHolder.vilom.setText(vilom_st.get(i).toString());

    }

    @Override
    public int getItemCount() {
        return sabd_st.size();
    }
}