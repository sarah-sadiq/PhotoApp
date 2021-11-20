package com.example.photoapp.MainActivity;

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
import android.widget.ImageView;

import com.example.photoapp.FilterActivity.FilterActivity;
import com.example.photoapp.R;
import com.example.photoapp.SettingsActivity.SettingsActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainViewFragment extends Fragment implements MainContract.View {

    MainContract.Presenter mPresenter;
    ImageView imageView;

    public MainViewFragment() {
        // Required empty public constructor
    }

    public static MainViewFragment newInstance(String param1, String param2) {
        MainViewFragment fragment = new MainViewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_main_view, container, false);

        imageView = root.findViewById(R.id.ivPhotoCard);
        
        Button keepButton = root.findViewById(R.id.btKeep);
        keepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
        Button deleteButton = root.findViewById(R.id.btDelete);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
        Button undoButton = root.findViewById(R.id.btUndo);
        undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
        Button albumsButton = root.findViewById(R.id.btAlbum);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
        Button shareButton = root.findViewById(R.id.btShare);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
        return root;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:  {
                // navigate to main screen
                mPresenter.sendSettingsClicked();
                return true;
            }
            case R.id.filter:  {
                // navigate to main screen
                mPresenter.sendFilterClicked();
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void startFilterActivity() {
        Intent filterIntent = new Intent();
        filterIntent.setClass(getActivity(), FilterActivity.class);
        startActivity(filterIntent);
    }

    @Override
    public void startSettingsActivity() {
        Intent settingsIntent = new Intent();
        settingsIntent.setClass(getActivity(), SettingsActivity.class);
        startActivity(settingsIntent);
    }
}