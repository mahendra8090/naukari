package com.example.administrator.nauraki;



import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hp on 4/10/2018.
 */

public class Upp_gs extends Fragment implements View.OnClickListener
{
   RecyclerView Gstopic_list_recycler;
   RecyclerView.LayoutManager Gstopic_layoutmanager;
    RecyclerView.Adapter GstopiclistAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.gs_upp,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Gstopic_list_recycler= (RecyclerView) getActivity().findViewById(R.id.gstopic_list_recycler);
        Gstopic_layoutmanager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        Gstopic_list_recycler.setLayoutManager(Gstopic_layoutmanager);
        GstopiclistAdapter=new Topic_list_adpater(getActivity(),2);
        Gstopic_list_recycler.setAdapter(GstopiclistAdapter);

    }

    @Override
    public void onClick(View v) {

            }
        }




