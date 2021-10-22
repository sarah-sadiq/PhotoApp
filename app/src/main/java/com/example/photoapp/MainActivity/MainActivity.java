package com.example.photoapp.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.photoapp.R;

public class MainActivity extends AppCompatActivity {

    MainContract.Presenter mPresenter;
    MainContract.View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter();
        mView = (MainContract.View) getSupportFragmentManager().findFragmentById(R.id.fcvMain);
        mPresenter.setView(mView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.startPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    }
