package com.example.photoapp.FilterActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.photoapp.MainActivity.MainActivity;
import com.example.photoapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FilterViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FilterViewFragment extends Fragment implements FilterContract.View {
    private FilterContract.Presenter mPresenter;
    Button backButtonF;

    public FilterViewFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment FilterViewFragment.
     */
    public static FilterViewFragment newInstance(String param1, String param2) {
        FilterViewFragment fragment = new FilterViewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_filter_view, container, false);

        return root;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.filter_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:  {
                // navigate to main screen
                mPresenter.notifyBackClicked();
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void setPresenter(FilterContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void finishActivity() {
        getActivity().finish();

    }
}