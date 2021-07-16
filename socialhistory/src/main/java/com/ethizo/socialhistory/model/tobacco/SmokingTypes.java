package com.ethizo.socialhistory.model.tobacco;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SmokingTypes {

    @SerializedName("smoking_tobacco")
    public List<SmokingNonSmokingTobacco> smokingNonSmokingTobacco;
    @SerializedName("non_smoking_tobacco")
    public List<SmokingNonSmokingTobacco> nonSmokingNonSmokingTobacco;
}
