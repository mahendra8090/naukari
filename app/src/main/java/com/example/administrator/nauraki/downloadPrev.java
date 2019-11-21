package com.example.administrator.nauraki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class downloadPrev extends AppCompatActivity {
RecyclerView downloadlisturl_recycler;
RecyclerView.LayoutManager download_url_list_manager;
RecyclerView.Adapter download_url_list_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_prev);
        String exam=getIntent().getStringExtra("exam");
        downloadlisturl_recycler=(RecyclerView)findViewById(R.id.downloadlisturl_recycler);
        download_url_list_manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        downloadlisturl_recycler.setLayoutManager(download_url_list_manager);
        download_url_list_adapter=new download_url_adapter(this);
        downloadlisturl_recycler.setAdapter(download_url_list_adapter);

    }
}
