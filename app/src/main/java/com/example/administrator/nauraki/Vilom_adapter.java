package com.example.administrator.nauraki;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Vilom_adapter extends RecyclerView.Adapter<Vilom_adapter.ViewHolder> {

ArrayList<String> sabd_st=new ArrayList<>();
    ArrayList<String> vilom_st=new ArrayList<>();
    Context mcontext;
ArrayList<Boolean> check= new ArrayList<>();
    public Vilom_adapter(Context c) {
        mcontext=c;
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        Json_math j=new Json_math();
       st= j.getJSon1_titledata_vilom(c);
       sabd_st=st.get(0);
       vilom_st=st.get(1);
      for(int i=0;i<sabd_st.size();i++){
          check.add(true);
      }
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;

        public TextView sabd;
        public TextView vilom;
        public CheckBox mcheckBox;

        public TextView serial_vilom;

        public ViewHolder(View itemView) {
        super(itemView);
        serial_vilom = (TextView)itemView.findViewById(R.id.serial_vilom);
        sabd = (TextView)itemView.findViewById(R.id.sabd_upp_vilom);
        vilom = (TextView)itemView.findViewById(R.id.vilom_upp_vilom);
        mcheckBox=(CheckBox)itemView.findViewById(R.id.checkBox);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(mcheckBox.isChecked())
                    Toast.makeText(mcontext, "clicked", Toast.LENGTH_SHORT).show();
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
        int t=i+1;
        viewHolder.serial_vilom.setText(""+t+"-");
        if(check.get(i)==false)
       viewHolder.mcheckBox.performClick();
    }

    @Override
    public int getItemCount() {
        return sabd_st.size();
    }
}