package com.example.administrator.nauraki;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by hp on 4/10/2018.
 */

public class Upp_reasoning extends Fragment implements View.OnClickListener{

   RecyclerView Mreasoningtopic_list_id;
   RecyclerView.LayoutManager reasoningtopic_manager;
   RecyclerView.Adapter reasoning_adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.reasoning_upp,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Mreasoningtopic_list_id= (RecyclerView) getActivity().findViewById(R.id.reasoningtopic_list_id);
reasoningtopic_manager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
Mreasoningtopic_list_id.setLayoutManager(reasoningtopic_manager);
reasoning_adapter=new Topic_list_adpater(getActivity(),3);
Mreasoningtopic_list_id.setAdapter(reasoning_adapter);

    }

    @Override
    public void onClick(View v) {



    }
}
