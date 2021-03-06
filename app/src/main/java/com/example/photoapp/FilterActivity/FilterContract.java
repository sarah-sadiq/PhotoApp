package com.example.photoapp.FilterActivity;

public interface FilterContract {
    public interface Presenter {
        public void setView(FilterContract.View view);
        public void startPresenter();
        public void notifyBackClicked();
    }

    public interface View {
        public void setPresenter(FilterContract.Presenter presenter);
        public void finishActivity();
    }
}
