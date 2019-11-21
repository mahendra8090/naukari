package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static maes.tech.intentanim.CustomIntent.customType;

public class ParibhasaDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paribhasa_detail);
    }

    @Override
    public void finish() {
        super.finish();
        customType(ParibhasaDetail.this,"right-to-left");
    }
}
