package com.example.photoapp.MainActivity;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mView;

    @Override
    public void startPresenter(){
        mView.setPresenter(this);
    }

    @Override
    public void setView(MainContract.View view) {
        mView = view;
    }

    @Override
    public void sendSettingsClicked() {
        mView.startSettingsActivity();
    }

    @Override
    public void sendFilterClicked() {
        mView.startFilterActivity();
    }
}
