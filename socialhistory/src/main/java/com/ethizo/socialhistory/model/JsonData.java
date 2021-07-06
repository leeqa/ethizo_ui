package com.ethizo.socialhistory.model;

import com.google.gson.annotations.SerializedName;

public class JsonData {

    public String updated;
    @SerializedName("ever_used")
    public String everUsed;
    public boolean reviewed;
    @SerializedName("smoking_status")
    public String smokingStatus;
    @SerializedName("tobacco_use_status")
    public String tobaccoUseStatus;


}
