package com.example.administrator.nauraki;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class download_url_adapter extends RecyclerView.Adapter<download_url_adapter.ViewHolder> {

ArrayList<String> file_name=new ArrayList<>();
   Context mcontext;

    public download_url_adapter(Context c) {
      GetArray g=new GetArray();
      file_name=g.getdownload_list();
      mcontext=c;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;

    public TextView File_name;



    public ViewHolder(View itemView) {
        super(itemView);
        File_name = (TextView)itemView.findViewById(R.id.download_item_name);



        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent i=new Intent();
                i.setType(Intent.ACTION_VIEW);
                i.setData(Uri.parse(file_name.get(getPosition())));
                mcontext.startActivity(i);

            }
        });
    }
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.download_url_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.File_name.setText(file_name.get(i).toString());


    }

    @Override
    public int getItemCount() {
        return file_name.size();
    }
}