package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   RecyclerView rc;
   RecyclerView.LayoutManager LayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=findViewById(R.id.recyclerview);
        LayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,true);
        rc.setLayoutManager(LayoutManager);
        MyAdapter ma=new MyAdapter();
        rc.setAdapter(ma);

    }
}