package com.example.kesepara.get;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.CardViewHolder> {

    private static final String TAG = NewsAdapter.class.getSimpleName();

    private ArrayList<News> newsList;
    private LayoutInflater inflater;

    public NewsAdapter(Context context, ArrayList<News> newsList) {
        this.inflater = LayoutInflater.from(context);
        this.newsList = newsList;
    }

    /**
     * Bu method adaptör oluşturulduğunda oluşturduğumuz ViewHolder'ın başlatılması için çağrılır.
     */
    @NonNull
    @Override
    public NewsAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = this.inflater.inflate(R.layout.item_news_card, viewGroup, false);
        CardViewHolder holder = new CardViewHolder(view);
        return holder;
    }

    /**
     * onCreateViewHolder’dan dönen verileri bağlama işlemini gerçekleştirildiği metotdur.
     */
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int position) {
        News selectedNews = this.newsList.get(position);
        cardViewHolder.setData(selectedNews, position);
    }

    /**
     * Listemizin eleman sayısını döndüren metottur.
     */
    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvItemTitle;
        ImageView ivItemPhoto;

        public CardViewHolder(View itemView) {
            super(itemView);
            tvItemTitle = itemView.findViewById(R.id.tvItemTitle);
            ivItemPhoto = itemView.findViewById(R.id.ivItemPhoto);
        }

        public void setData(News selectedNews, int position) {
            this.tvItemTitle.setText(selectedNews.getTitle());
            this.ivItemPhoto.setImageResource(selectedNews.getImgUrl());
        }

        @Override
        public void onClick(View v) {
            Log.v(TAG, "#: onClick");
        }
    }
}
