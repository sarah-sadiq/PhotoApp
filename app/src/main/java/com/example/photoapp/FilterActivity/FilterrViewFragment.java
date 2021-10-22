package com.example.photoapp.FilterActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.photoapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FilterrViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FilterrViewFragment extends Fragment {

    public FilterrViewFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment FilterrViewFragment.
     */
    public static FilterrViewFragment newInstance(String param1, String param2) {
        FilterrViewFragment fragment = new FilterrViewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_filterr_view, container, false);

        return root;
    }
}