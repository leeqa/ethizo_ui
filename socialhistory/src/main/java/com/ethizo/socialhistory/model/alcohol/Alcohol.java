package com.ethizo.socialhistory.model.alcohol;

import com.ethizo.socialhistory.model.BaseHistory;
import com.ethizo.socialhistory.model.breakfast.BreakfastData;

public class Alcohol extends BaseHistory<AlcoholData> {

    public Alcohol() {
        section = "alcohol_caffeine_hydration";
        confidential = 0;
        subSection = "alcohol_caffeine_hydration";
        historyType = "social_history";

        data = new AlcoholData();


    }
}
