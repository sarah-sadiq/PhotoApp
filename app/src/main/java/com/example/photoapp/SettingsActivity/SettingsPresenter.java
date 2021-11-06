package com.example.photoapp.SettingsActivity;

public class SettingsPresenter implements SettingsContract.Presenter {
    private SettingsContract.View mView;

    @Override
    public void setView(SettingsContract.View view) {
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
