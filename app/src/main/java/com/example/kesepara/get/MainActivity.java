package com.example.kesepara.get;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvNews;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<News> newsList = new ArrayList<>();

        newsList.add(new News(1, "Çocuk dostu kitap listesine 26 yeni eser", R.drawable.book, ""));
        newsList.add(new News(2, "President Donald Trump's poll numbers are bad, but here's why he could win in 2020", R.drawable.thrump, ""));
        newsList.add(new News(3, "Samsung'tan ucuza telefon: Galaxy S10 bu renklerde geliyor!", R.drawable.samsung, ""));
        newsList.add(new News(3, "Dünyanın ilk Snapdragon 855’li ve katlanabilir ekranlı telefonu FlexPai oldu. Telefon şirketin resmi sitesi üzerinden ön satışa sunuldu.", R.drawable.flexpai, ""));
        newsList.add(new News(3, "PES 2019 Mobile yayınlandı; artık oyun severler telefonları başından da PES 2019 oynayabilecek.", R.drawable.pes, ""));

        rvNews = findViewById(R.id.rvNews);
        NewsAdapter newsAdapter = new NewsAdapter(context, newsList);
        rvNews.setAdapter(newsAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvNews.setLayoutManager(linearLayoutManager);
    }
}
