package com.example.simplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private ArrayList<String> mArrayList;
    private SimpleAdapter mSimpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayList = new ArrayList<>();
        mSimpleAdapter = new SimpleAdapter(mArrayList);

        mRecyclerView = (RecyclerView) findViewById(R.id.a_main_recycler);
        mRecyclerView.setAdapter(mSimpleAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        mArrayList.add("Hello");
        mArrayList.add("World");
        mArrayList.add("Cruel");
        mSimpleAdapter.notifyDataSetChanged();
    }
}
