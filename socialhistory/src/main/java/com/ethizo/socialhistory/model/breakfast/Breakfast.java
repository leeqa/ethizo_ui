package com.ethizo.socialhistory.model.breakfast;

import com.ethizo.socialhistory.model.BaseHistory;

import java.util.ArrayList;

public class Breakfast extends BaseHistory<BreakfastData> {

    public Breakfast() {
        section = "vaping_use";
        confidential = 0;
        subSection = "vaping";
        historyType = "social_history";

        data = new BreakfastData();
    }

    public void addBreakfast(String stuff, String serving, String measure){
        BreakfastItem breakfastItem = new BreakfastItem(stuff, serving, measure);

        data.breakfastItems.add(breakfastItem);

    }


}
