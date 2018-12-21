package com.skesepara.get;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvNews;
    private Context context = this;
//    private ImageView ivTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<News> newsList = new ArrayList<>();

        newsList.add(new News(1, "Çocuk dostu kitap listesine 26 yeni eser", "http://i.hurimg.com/i/hurriyet/75/750x422/5c169d230f25442178054936.jpg", ""));
        newsList.add(new News(2, "President Donald Trump's poll numbers are bad, but here's why he could win in 2020", "http://i.hurimg.com/i/hurriyet/75/750x422/5c16ad4e0f254421780549db.jpg", ""));
        newsList.add(new News(3, "Samsung'tan ucuza telefon: Galaxy S10 bu renklerde geliyor!", "http://i.hurimg.com/i/hurriyet/75/750x422/5c15f1d60f25442178053b67.jpg", ""));
        newsList.add(new News(3, "Dünyanın ilk Snapdragon 855’li ve katlanabilir ekranlı telefonu FlexPai oldu. Telefon şirketin resmi sitesi üzerinden ön satışa sunuldu.", "http://i.hurimg.com/i/hurriyet/75/750x422/5c164c8e0f25442178054471.jpg", ""));
        newsList.add(new News(3, "PES 2019 Mobile yayınlandı; artık oyun severler telefonları başından da PES 2019 oynayabilecek.", "http://i.hurimg.com/i/hurriyet/75/750x422/5c152fc7c03c0e2ab8156df0.jpg", ""));

        rvNews = findViewById(R.id.rvNews);
        NewsAdapter newsAdapter = new NewsAdapter(context, newsList);
        rvNews.setAdapter(newsAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvNews.setLayoutManager(linearLayoutManager);
    }
}
