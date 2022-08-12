package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News(("Ferroviaria tem desfalque Importante"),
                "nononononononononononono"));
        news.add(new News(("Ferrinha joga no Sabado"),
                "nononononononononononono"));
        news.add(new News(("Copa do mundo Feminina está Terminando"),
                "nononononononononononono"));

        this.news.setValue(news);

    }

    public LiveData<List<News>> getNews() {

        return this.news;
    }
}