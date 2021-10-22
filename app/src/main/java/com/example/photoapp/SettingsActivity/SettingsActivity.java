package com.example.photoapp.SettingsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.photoapp.R;

public class SettingsActivity extends AppCompatActivity {
    SettingsContract.Presenter mPresenter;
    SettingsContract.View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mPresenter = new SettingsPresenter();
        mView = (SettingsContract.View) getSupportFragmentManager().findFragmentById(R.id.fcvSettings);
        mPresenter.setView(mView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.startPresenter();
    }
}