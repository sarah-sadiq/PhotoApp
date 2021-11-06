package com.example.photoapp.FilterActivity;

public class FilterPresenter implements FilterContract.Presenter {
    FilterContract.View mView;

    @Override
    public void setView(FilterContract.View view) {
        mView = view;
    }

    @Override
    public void startPresenter() {
        mView.setPresenter(this);
    }

    @Override
    public void notifyBackClicked() {
        mView.finishActivity();
    }
}
