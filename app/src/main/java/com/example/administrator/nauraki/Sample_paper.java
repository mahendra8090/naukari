package com.example.administrator.nauraki;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Sample_paper extends AppCompatActivity {
    private StorageReference mStorageRef;
    RecyclerView sampledownloadurl_recycler;
    RecyclerView.Adapter sampledownloadurl_adapter;
    RecyclerView.LayoutManager sampledownloadurl_manager;
    FirebaseDatabase firebaseDatabase;
    ArrayList<ArrayList<ArrayList<String>>> st=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_paper);
        firebaseDatabase=FirebaseDatabase.getInstance();

        sampledownloadurl_recycler=(RecyclerView)findViewById(R.id.sampledownloadurl_recycler);
        sampledownloadurl_manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        sampledownloadurl_recycler.setLayoutManager(sampledownloadurl_manager);
        sampledownloadurl_adapter=new downloadurl_list_adpater(this,1);
        sampledownloadurl_recycler.setAdapter(sampledownloadurl_adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        DatabaseReference mref=firebaseDatabase.getReference();
        mref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
             //   Toast.makeText(Sample_paper.this, ""+dataSnapshot.getValue().toString(), Toast.LENGTH_SHORT).show();
              GetArray g=new GetArray();
                try {
                    st.add(g.getdownloadurl(dataSnapshot.getValue().toString()));
                    Toast.makeText(Sample_paper.this, ""+((g.getdownloadurl(dataSnapshot.getValue().toString()).get(0)).get(0).toString()), Toast.LENGTH_SHORT).show();
                } catch (JSONException e) {
                    Toast.makeText(Sample_paper.this, "error", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
