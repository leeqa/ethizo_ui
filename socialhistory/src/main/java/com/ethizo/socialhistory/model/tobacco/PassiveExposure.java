package com.ethizo.socialhistory.model.tobacco;

import com.ethizo.socialhistory.model.BaseHistory;
import com.google.gson.annotations.SerializedName;

public class PassiveExposure extends BaseHistory {

    public PassiveExposure() {
        section = "tobacco_use";
        confidential = 0;
        subSection = "passive_exposure";
        historyType = "social_history";
        super.data = this;

        type = "sdasdsa";
        comments = "sadasdsa";
    }

    public String type, comments;

    @SerializedName("ever_had_passive_smoke")
    private String isPassiveSmoker;
    @SerializedName("ever_had_passive_vaping")
    private String isHadVaping;
    @SerializedName("exposure_in_home_environment")
    private String isInHome;

    @SerializedName("level_of_exposure")
    public String levelOfExposure;
    @SerializedName("length_of_exposure")
    public String lengthOfExposure;
    @SerializedName("other_exposure_locations")
    public String otherLocations;

    public boolean getIsPassiveSmoker() {
        return strToBool(isPassiveSmoker);
    }

    public void setIsPassiveSmoker(boolean isPassiveSmoker) {
        this.isPassiveSmoker = boolToStr(isPassiveSmoker);
    }

    public boolean getIsHadVaping() {
        return strToBool(isHadVaping);
    }

    public void setIsHadVaping(boolean isHadVaping) {
        this.isHadVaping = boolToStr(isHadVaping);
    }

    public boolean getIsInHome() {
        return strToBool(isInHome);
    }

    public void setIsInHome(boolean isInHome) {
        this.isInHome = boolToStr(isInHome);
    }
}
