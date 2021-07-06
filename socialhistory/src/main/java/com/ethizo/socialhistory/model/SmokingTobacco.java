package com.ethizo.socialhistory.model;

import com.google.gson.annotations.SerializedName;

public class SmokingTobacco {


    public String name;
    public boolean active;
    @SerializedName("daily_use")
    public boolean dailyUse;
    @SerializedName("usage_per_day")
    public String usagePerDay;
    @SerializedName("years_used")
    public String yearsUsed;
    @SerializedName("pack_year")
    public String packYear;
    @SerializedName("age_started")
    public String ageStarted;
    @SerializedName("age_stopped")
    public String ageStopped;

}
