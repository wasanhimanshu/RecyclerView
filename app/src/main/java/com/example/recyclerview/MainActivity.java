package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView mRecyclerView;
private ArrayList<News>news;
private NewsAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        news=new ArrayList<>();
        mRecyclerView=(RecyclerView)findViewById(R.id.recylcer_view);
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        news.add(new News("Farmer's Protest",getString(R.string.news_data),"12/01/2021"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter=new NewsAdapter(this,news);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

    }
}