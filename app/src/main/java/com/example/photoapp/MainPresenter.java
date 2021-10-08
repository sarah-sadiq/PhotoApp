package com.example.photoapp;

public class MainPresenter {

    private MainModel mModel;
    private MainView mView;

    public MainPresenter(){
        mModel = new MainModel();
    }

    public void start(){

    }

    public void setView(MainView view){
        mView = view;
    }

}
