package com.example.photoapp.SettingsActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.photoapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsViewFragment extends Fragment implements SettingsContract.View {
    SettingsContract.Presenter mPresenter;

    public SettingsViewFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SettingsViewFragment.
     */
    public static SettingsViewFragment newInstance(String param1, String param2) {
        SettingsViewFragment fragment = new SettingsViewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_settings_view, container, false);

        return root;
    }

    @Override
    public void setPresenter(SettingsContract.Presenter presenter) {
        mPresenter = presenter;
    }
}