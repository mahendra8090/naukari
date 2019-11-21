package com.example.administrator.nauraki;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Tatsam_adapter extends RecyclerView.Adapter<Tatsam_adapter.ViewHolder> {

    ArrayList<String> sabd_st=new ArrayList<>();
    ArrayList<String> vilom_st=new ArrayList<>();

    public Tatsam_adapter(Context c) {
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        Json_math j=new Json_math();
        st= j.getJSon1_titledata_tatsam(c);
        sabd_st=st.get(0);
        vilom_st=st.get(1);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;

    public TextView sabd;
    public TextView vilom;
        public TextView serial;

    public ViewHolder(View itemView) {
        super(itemView);
serial=(TextView)itemView.findViewById(R.id.serial_vilom);
        sabd = (TextView)itemView.findViewById(R.id.sabd_upp_vilom);
        vilom =
                (TextView)itemView.findViewById(R.id.vilom_upp_vilom);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {


            }
        });
    }
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.vilom_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.sabd.setText(sabd_st.get(i).toString());
        viewHolder.vilom.setText(vilom_st.get(i).toString());
        int j=i+1;
        viewHolder.serial.setText(""+j);

    }

    @Override
    public int getItemCount() {
        return sabd_st.size();
    }
}