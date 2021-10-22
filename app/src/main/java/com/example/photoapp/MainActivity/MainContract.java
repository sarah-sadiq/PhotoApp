package com.example.photoapp.MainActivity;

public interface MainContract {
    public interface Presenter {
        public void setView(View view);
        public void startPresenter();
        public void sendSettingsClicked();
        public void sendFilterClicked();
    }

    public interface View {
        public void setPresenter(Presenter presenter);
        public void startFilterActivity();
        public void startSettingsActivity();
    }
}
