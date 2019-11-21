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

import java.util.ArrayList;

/**
 * Created by hp on 4/10/2018.
 */

public class Upp_math extends Fragment implements View.OnClickListener {




RecyclerView Math_list_recycler;
RecyclerView.LayoutManager mathlist_layoutmanager;
RecyclerView.Adapter mathlist_adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.math_upp,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Math_list_recycler=(RecyclerView)getActivity().findViewById(R.id.math_list_recycler);
        mathlist_layoutmanager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        Math_list_recycler.setLayoutManager(mathlist_layoutmanager);
        mathlist_adapter=new Topic_list_adpater(getActivity(),1);
        Math_list_recycler.setAdapter(mathlist_adapter);


    }



    @Override
    public void onClick(View v) {
        /*
switch (v.getId()){

case R.id.mathc1 : {
    Intent i = new Intent(getActivity(), QuestonMath.class);
    i.putExtra("row","1");
    startActivity(i);

break;}
    case R.id.mathc2 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","2");
        startActivity(i);

        break;}

    case R.id.mathc3 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","3");
        startActivity(i);

        break;}

    case R.id.mathc4 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","4");
        startActivity(i);

        break;}

    case R.id.mathc5 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","5");
        startActivity(i);

        break;}

    case R.id.mathc6 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","6");
        startActivity(i);

        break;}

    case R.id.mathc7 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","7");
        startActivity(i);

        break;}

    case R.id.mathc8 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","8");
        startActivity(i);

        break;}

    case R.id.mathc9 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","9");
        startActivity(i);

        break;}

    case R.id.mathc10 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","10");
        startActivity(i);

        break;}

    case R.id.mathc11 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","11");
        startActivity(i);

        break;}
    case R.id.mathc12 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","12");
        startActivity(i);

        break;}
    case R.id.mathc13 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","13");
        startActivity(i);

        break;}
    case R.id.mathc14 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","14");
        startActivity(i);

        break;}
    case R.id.mathc15 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","15");
        startActivity(i);

        break;}
    case R.id.mathc16 : {
        Intent i = new Intent(getActivity(), QuestonMath.class);
        i.putExtra("row","16");
        startActivity(i);

        break;}


*/

}
}
