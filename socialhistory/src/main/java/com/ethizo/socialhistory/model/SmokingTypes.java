package com.ethizo.socialhistory.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SmokingTypes {

    @SerializedName("smoking_tobacco")
    public List<SmokingTobacco> smokingTobacco;
    public List<SmokingTobacco> nonSmokingTobacco;

    public void setSmokingTobacco(List<SmokingTobacco> smokingTobacco) {
        this.smokingTobacco = smokingTobacco;
    }

    public void setNonSmokingTobacco(List<SmokingTobacco> nonSmokingTobacco) {
        this.nonSmokingTobacco = nonSmokingTobacco;
    }
}
