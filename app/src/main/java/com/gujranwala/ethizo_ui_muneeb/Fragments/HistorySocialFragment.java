package com.gujranwala.ethizo_ui_muneeb.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gujranwala.ethizo_ui_muneeb.R;

public class HistorySocialFragment extends Fragment {


    public HistorySocialFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history_social, container, false);

        // Inflate the layout for this fragment
        return view;
    }
}