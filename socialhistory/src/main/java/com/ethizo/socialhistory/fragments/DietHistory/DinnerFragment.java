package com.ethizo.socialhistory.fragments.DietHistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ethizo.socialhistory.R;

public class DinnerFragment extends Fragment {


    public DinnerFragment() {
        // Required empty public constructor
    }

    public static DinnerFragment newInstance() {
        DinnerFragment fragment = new DinnerFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_breakfast, container, false);
        DietHistoryFragment.initTitles(view, "Dinner");

        return view;
    }
}