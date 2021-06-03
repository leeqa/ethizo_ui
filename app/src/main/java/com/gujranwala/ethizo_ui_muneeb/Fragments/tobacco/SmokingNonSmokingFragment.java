package com.gujranwala.ethizo_ui_muneeb.Fragments.tobacco;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gujranwala.ethizo_ui_muneeb.R;

public class SmokingNonSmokingFragment extends Fragment {


    public SmokingNonSmokingFragment() {
        // Required empty public constructor
    }

    public static SmokingNonSmokingFragment newInstance(String param1, String param2) {
        SmokingNonSmokingFragment fragment = new SmokingNonSmokingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
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
        View view = inflater.inflate(R.layout.fragment_smoking_non_smoking, container, false);
        SmokingTobacco smokingTobacco = (SmokingTobacco) getChildFragmentManager().findFragmentByTag("smokingFragment");
        Button btnSave = view.findViewById(R.id.btn_save);

        btnSave.setOnClickListener(v -> {
            if(smokingTobacco.validate()){
                Log.e("onCreateView: ", "saved");
            }
        });



        return view;
    }
}