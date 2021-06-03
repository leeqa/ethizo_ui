package com.gujranwala.ethizo_ui_muneeb.Fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gujranwala.ethizo_ui_muneeb.R;

public class SmokingTobacco extends Fragment {

    public SmokingTobacco() {
        // Required empty public constructor
    }

    public static SmokingTobacco newInstance(String param1, String param2) {
        SmokingTobacco fragment = new SmokingTobacco();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return DataBindingUtil.inflate(getLayoutInflater(), R.layout.fragment_smoking_tobacco, container, false).getRoot();

//        return inflater.inflate(R.layout.fragment_smoking_tobacco, container, false);
    }
}