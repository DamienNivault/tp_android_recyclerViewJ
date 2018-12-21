package com.example.damiennivault.recyclerviewj;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class WelcomeScreenViewModel extends ViewModel {

    private LiveData<List<News>> news;

    public LiveData<List<News>> getNews() {
        if (news == null) {
            news = new NewsLiveData();
        }
        return news;
    }


}