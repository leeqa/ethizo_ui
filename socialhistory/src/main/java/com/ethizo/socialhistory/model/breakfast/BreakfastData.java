package com.ethizo.socialhistory.model.breakfast;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BreakfastData {

    public String updated;
    @SerializedName("data")
    public List<BreakfastItem> breakfastItems = new ArrayList<>();
}
