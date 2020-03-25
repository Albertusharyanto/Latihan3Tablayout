package com.example.latihan3tablayout;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String>dataSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
        dataSet=new ArrayList<>();
        initDataSet();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutManager=new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter=new RecyclerViewAdapter(dataSet);
        rvView.setAdapter(adapter);

    }




    private void initDataSet() {
        dataSet.add("Keras Sakti The Movie");
        dataSet.add("Kuntilanak");
        dataSet.add("Madagaskar");
        dataSet.add("Spongebob The Movie");
        dataSet.add("One Piece Kaido Movie");
        dataSet.add("B-Daman Action World");
        dataSet.add("Corona Holiday");
        dataSet.add("Lord Oden");
        dataSet.add("Yakuza Come Back");
        dataSet.add("Good Luck");
    }
}