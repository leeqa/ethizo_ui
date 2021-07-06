package com.ethizo.socialhistory.fragments.tobacco;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.ethizo.socialhistory.R;

public class NonSmokingTobaccoFragment extends Fragment {


    private View view;
    public NonSmokingTobaccoFragment() {
        // Required empty public constructor
    }

    public static NonSmokingTobaccoFragment newInstance(String param1, String param2) {
        NonSmokingTobaccoFragment fragment = new NonSmokingTobaccoFragment();
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

        view = inflater.inflate(R.layout.fragment_non_smoking_tobacco, container, false);

        return view;
    }

    boolean value = false;

    private boolean findInViewGroup(ViewGroup llUsage){
        for (int i=0; i<llUsage.getChildCount(); i++){
            if(llUsage.getChildAt(i) instanceof ViewGroup){
                findInViewGroup((ViewGroup) llUsage.getChildAt(i));
            }
            View childView = llUsage.getChildAt(i);
            if(childView instanceof EditText && !((EditText) childView).getText().toString().isEmpty()){
                value =  true;
                break;
            }
        }
        return value;
    }

    public boolean validate(){
        value = false;
        findInViewGroup(view.findViewById(R.id.ll_tobacco_usages));
        Log.e( "return: ", value+"" );
        return value;
    }
}