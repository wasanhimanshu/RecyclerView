package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
private Context mContext;
private  ArrayList<News> mNews;
public  NewsAdapter(Context context,ArrayList<News>news){
    mContext=context;
    mNews=news;
}

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
final News news=mNews.get(position);
holder.title.setText(news.getmTitle());
holder.description.setText(news.getmDescription());
holder.date.setText(news.getmDate());

    }

    @Override
    public int getItemCount() {
      return  mNews.size();
    }


    public  static  class NewsViewHolder extends RecyclerView.ViewHolder{
      TextView title;
      TextView description;
      TextView date;
      View rootView;
      public NewsViewHolder(@NonNull View itemView){
          super(itemView);
          rootView=itemView;
          title=(TextView)rootView.findViewById(R.id.title_text_view);
          description=(TextView)rootView.findViewById(R.id.des_text_view);
          date=(TextView)rootView.findViewById(R.id.date_text_view);


      }
  }
}
