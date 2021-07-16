package com.ethizo.socialhistory.model.tobacco;

import com.ethizo.socialhistory.model.BaseHistory;
import com.ethizo.socialhistory.model.tobacco.data.TobaccoData;

public class SmokingNonSmokingTobacco extends BaseHistory<TobaccoData> {


    public SmokingNonSmokingTobacco() {
        section = "tobacco_use";
        confidential = 0;
        subSection = "historical_use";
        historyType = "social_history";
        //Override json_data
        data = new TobaccoData();
    }
}
