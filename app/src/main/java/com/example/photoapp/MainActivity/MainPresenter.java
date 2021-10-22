package com.example.photoapp.MainActivity;

import com.example.photoapp.MainActivity.MainContract;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mView;

    @Override
    public void startPresenter(){ }

    @Override
    public void setView(MainContract.View view) {
        mView = view;
    }
}
