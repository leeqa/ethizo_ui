package com.gujranwala.ethizo_ui_muneeb.Fragments.tobacco;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.gujranwala.ethizo_ui_muneeb.R;

public class NonSmokingTobacco extends Fragment {


    public NonSmokingTobacco() {
        // Required empty public constructor
    }

    public static NonSmokingTobacco newInstance(String param1, String param2) {
        NonSmokingTobacco fragment = new NonSmokingTobacco();
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

        View view = inflater.inflate(R.layout.fragment_non_smoking_tobacco, container, false);

        return view;
    }
}