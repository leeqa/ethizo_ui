package com.ethizo.socialhistory.fragments.tobacco;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.ethizo.socialhistory.R;

public class SmokingNonSmokingFragment extends Fragment {


    public SmokingNonSmokingFragment() {
        // Required empty public constructor
    }

    public static SmokingNonSmokingFragment newInstance() {
        SmokingNonSmokingFragment fragment = new SmokingNonSmokingFragment();
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
        SmokingTobaccoFragment smokingTobaccoFragment = (SmokingTobaccoFragment) getChildFragmentManager().findFragmentByTag("smokingFragment");
        NonSmokingTobaccoFragment nonSmokingTobaccoFragment = (NonSmokingTobaccoFragment) getChildFragmentManager().findFragmentByTag("nonSmokingFragment");

/*        Button btnSave = view.findViewById(R.id.btn_save);

        btnSave.setOnClickListener(v -> {
            if(smokingTobaccoFragment.validate() || nonSmokingTobaccoFragment.validate()){
                Log.e("onCreateView: ", "saved");
            }
        });*/



        return view;
    }
}