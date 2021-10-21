package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MainContract.Presenter mPresenter;
    MainContract.View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter();
        mView = (MainContract.View) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerViewMain);
        mPresenter.setView(mView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.startPresenter();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }


    }
