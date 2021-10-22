package com.example.photoapp.FilterActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.photoapp.R;

public class FilterActivity extends AppCompatActivity {
    FilterContract.Presenter mPresenter;
    FilterContract.View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        mPresenter = new FilterPresenter();
        mView = (FilterContract.View) getSupportFragmentManager().findFragmentById(R.id.fcvFilter);
        mPresenter.setView(mView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.startPresenter();
    }
}