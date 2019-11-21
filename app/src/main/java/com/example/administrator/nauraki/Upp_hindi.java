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
import android.widget.Toast;

import static maes.tech.intentanim.CustomIntent.customType;

/**
 * Created by hp on 4/10/2018.
 */

public class Upp_hindi extends Fragment implements View.OnClickListener
{   CardView c1;
    CardView c2;
    CardView c3;
    CardView c4;
    CardView c5;
    CardView c6;
    CardView c7;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.hindi_upp,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
c1=(CardView)getActivity().findViewById(R.id.c1);
        c2=(CardView)getActivity().findViewById(R.id.c2);
        c3=(CardView)getActivity().findViewById(R.id.c3);
        c4=(CardView)getActivity().findViewById(R.id.c4);
        c5=(CardView)getActivity().findViewById(R.id.c5);
        c6=(CardView)getActivity().findViewById(R.id.c6);
        c7=(CardView)getActivity().findViewById(R.id.c7);
c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.c1 :
            {
                Intent i=new Intent(getActivity(),Paribhasalist.class);
                startActivity(i);
                customType(getActivity(),"left-to-right");
                break;
            }
            case R.id.c2 :
            {
                Intent i=new Intent(getActivity(),Vilom_upp.class);
                startActivity(i);
                customType(getActivity(),"left-to-right");
                break;
            }
            case R.id.c3 :
            {
                Intent i=new Intent(getActivity(),Anekarthi.class);
                startActivity(i);
                customType(getActivity(),"left-to-right");
                break;
            }
            case R.id.c4 :
            {
                Intent i=new Intent(getActivity(),Tatsam.class);
                startActivity(i);
                customType(getActivity(),"left-to-right");
                break;
            }
            case R.id.c5 :
            {
                Intent i=new Intent(getActivity(),Prayawachi.class);
                startActivity(i);
                customType(getActivity(),"left-to-right");
                break;
            }
            case R.id.c6 :
            {
                Intent i=new Intent(getActivity(),Rachna.class);
                startActivity(i);
                customType(getActivity(),"left-to-right");
                break;
            }
            case R.id.c7 :
            {
                Intent i=new Intent(getActivity(),Vyakansh_Bodhak.class);
                startActivity(i);
                customType(getActivity(),"left-to-right");
                break;
            }


        }

            }
        }




