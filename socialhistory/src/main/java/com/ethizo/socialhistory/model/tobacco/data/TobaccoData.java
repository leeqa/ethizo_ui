package com.ethizo.socialhistory.model.tobacco.data;

import com.ethizo.socialhistory.model.tobacco.SmokingTypes;
import com.google.gson.annotations.SerializedName;

public class TobaccoData {

    @SerializedName("ever_used")
    public String everUsed;
    @SerializedName("smoking_status")
    public String smokingStatus;
    @SerializedName("tobacco_use_status")
    public String tobaccoUseStatus;
    public boolean reviewed;

    public SmokingTypes types;
}
