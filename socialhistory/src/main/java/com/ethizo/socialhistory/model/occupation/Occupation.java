package com.ethizo.socialhistory.model.occupation;

import com.ethizo.socialhistory.model.BaseHistory;
import com.ethizo.socialhistory.model.vaping.VapingData;


public class Occupation  extends BaseHistory<OccupationData> {

    public Occupation() {
        section = "occupation";
        confidential = 0;
        subSection = "occupation";
        historyType = "social_history";

        data = new OccupationData();
    }
}
