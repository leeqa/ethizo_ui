package com.gujranwala.ethizo_ui_muneeb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ethizo.socialhistory.model.BaseHistory;
import com.ethizo.socialhistory.model.tobacco.PassiveExposure;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BaseHistory history = new BaseHistory();
        PassiveExposure exposure = new PassiveExposure();
        exposure.lengthOfExposure  ="sdsadsa";
        history.data = history;
        String data = new Gson().toJson(exposure);
        Log.e( "onCreate: ", data+"");

    }
}