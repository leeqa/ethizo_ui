package com.gujranwala.ethizo_ui_muneeb.Fragments.tobacco;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gujranwala.ethizo_ui_muneeb.R;

public class SmokingTobacco extends Fragment {

    RadioButton rb_No_Never, rb_yes, rb_unknown;
    View view;
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

//        return DataBindingUtil.inflate(getLayoutInflater(), R.layout.fragment_smoking_tobacco, container, false).getRoot();

        view = inflater.inflate(R.layout.fragment_smoking_tobacco, container, false);
        init(view);

        return view;
    }

    private void init(View view){
        ((TextView)view.findViewById(R.id.layoutCigarette).findViewById(R.id.title)).setText("Cigarettes");
        ((TextView)view.findViewById(R.id.layoutCigars).findViewById(R.id.title)).setText("Cigars");
        ((TextView)view.findViewById(R.id.layoutPipe).findViewById(R.id.title)).setText("Pipe");
        ((TextView)view.findViewById(R.id.layoutElectronicCigarettes).findViewById(R.id.title)).setText("Electronic Cigarettes");

        rb_No_Never = view.findViewById(R.id.rb_No_Never);
        rb_yes = view.findViewById(R.id.rb_yes);
        rb_unknown = view.findViewById(R.id.rb_unknown);
    }

    boolean value = false;

    private boolean findInViewGroup(ViewGroup llUsage){
        for (int i=0; i<llUsage.getChildCount(); i++){
            if(llUsage.getChildAt(i) instanceof ViewGroup){
               findInViewGroup((ViewGroup) llUsage.getChildAt(i));
            }
            View childView = llUsage.getChildAt(i);
            Log.e( "validate: ", childView+"");
            if(childView instanceof EditText && !((EditText) childView).getText().toString().isEmpty()){
                Log.e( "init: ", ((EditText) childView).getText().toString()+"");
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