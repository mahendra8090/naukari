package com.example.administrator.nauraki;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by hp on 4/15/2018.
 */

public class Home_fragment extends Fragment {
    private int initialScrollPosition = 0;
    private int initialScrollYOffset = 0;
    ImageView icon1;
    ImageView icon2;
    ImageView icon3;
    ImageView icon4;
    ViewPager viewPager;
    FragmentManager fragmentManager;
    TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_layout,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
      if(savedInstanceState!=null){  super.onActivityCreated(savedInstanceState);}
        else{
          super.onActivityCreated(savedInstanceState);
        tabLayout = (TabLayout) getActivity().findViewById(R.id.tab_layout);
          Toast.makeText(getActivity(),"again ", Toast.LENGTH_SHORT).show();
            viewPager = (ViewPager) getActivity().findViewById(R.id.pager);

            viewPager.setAdapter(new myadapter(getFragmentManager()));
            viewPager.setCurrentItem(0);
            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    tabLayout.setScrollPosition(position,0,true);
                    tabLayout.setSelected(true);

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
            fragmentManager = getFragmentManager();
       // tabLayout.setupWithViewPager(viewPager);
        TabLayout.Tab tab1 = tabLayout.newTab().setText("Hindi");

        tabLayout.addTab(tab1);

        TabLayout.Tab tab2 = tabLayout.newTab().setText("Maths");
        tabLayout.addTab(tab2);
        TabLayout.Tab tab3 = tabLayout.newTab().setText("gs");
        tabLayout.addTab(tab3);
          TabLayout.Tab tab4 = tabLayout.newTab().setText("reasoning");
          tabLayout.addTab(tab4);
     //tabLayout.setTabTextColors(ColorStateList.valueOf(R.color.colorwhite));
        //tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colororange));

            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {

                    Toast.makeText(getActivity(), "" + tab.getPosition(), Toast.LENGTH_SHORT).show();
                    viewPager.setCurrentItem(tab.getPosition());

                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

        }}




    @Override
    public void onSaveInstanceState(Bundle outState) {


        super.onSaveInstanceState(outState);
    }

}

class myadapter extends FragmentStatePagerAdapter {


    public myadapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if(i==3){
            Upp_reasoning tab_fragment=new Upp_reasoning();
            return tab_fragment;
        }
        if(i==0){
            Upp_hindi tab_fragment2=new Upp_hindi();
            return tab_fragment2;
        }
        if(i==1){
            Upp_math tab_fragment3=new Upp_math();
            return tab_fragment3;
        }
        if(i==2){
            Upp_gs tab_fragment4=new Upp_gs();
            return tab_fragment4;
        }






        return null;
    }


    @Override
    public int getCount() {
        return 4;
    }



}
/* <android.support.v4.view.ViewPager

        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/pager"
        android:layout_below="@+id/toolbar"
        android:background="#000000"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginBottom="40sp"

        tools:context="com.example.hp.investosurestart.HomePage">
    </android.support.v4.view.ViewPager>*/