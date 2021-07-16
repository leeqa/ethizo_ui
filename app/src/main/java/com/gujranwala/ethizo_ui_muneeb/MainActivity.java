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

        PassiveExposure exposure = new PassiveExposure();

        String json = "{\"pid\":\"4745\",\"json_data\":{\"updated\":\"07/06/2021\",\"ever_had_passive_smoke\":\"Yes\",\"type\":\"Cigarette\",\"ever_had_passive_vaping\":\"Yes\",\"exposure_in_home_environment\":\"Yes\",\"other_exposure_locations\":\"Office\",\"length_of_exposure\":\"1sads\",\"level_of_exposure\":\"Mild\",\"comments\":\"this is comment\"},\"section\":\"tobacco_use\",\"sub_section\":\"passive_exposure\",\"confidential\":0,\"history_type\":\"social_history\",\"latest_update_type\":\"reviewed_updated\"}";
        exposure = new Gson().fromJson(json, PassiveExposure.class);

        String data = new Gson().toJson(exposure.data);
        Log.e( "onCreate: ", data+"");
    }
}