package com.example.administrator.nauraki;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class UPP extends AppCompatActivity {
FragmentManager fragmentManager=getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upp);

        Home_fragment f1=new Home_fragment();

        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.home_layout_fragment,f1,"homepage");

        transaction.commit();
}

    @Override
    public void finish() {
        super.finish();
        customType(UPP.this,"up-to-bottom");
    }
}
