package com.example.photoapp.SettingsActivity;

public interface SettingsContract {
    public interface Presenter {
        public void setView(SettingsContract.View view);
        public void startPresenter();
    }

    public interface View {
        public void setPresenter(SettingsContract.Presenter presenter);
    }
}
