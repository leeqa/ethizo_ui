package com.ethizo.socialhistory.model.vaping;

import com.ethizo.socialhistory.model.BaseHistory;

public class Vaping extends BaseHistory<VapingData> {

    public Vaping(){
        section = "vaping_use";
        confidential = 0;
        subSection = "vaping";
        historyType = "social_history";

        data = new VapingData();
    }
}
