package com.example.photoapp;

public interface MainContract {
    public interface Presenter {
        public void setView(View view);
        public void startPresenter();
    }

    public interface View {
        public void setPresenter(Presenter presenter);
    }
}
