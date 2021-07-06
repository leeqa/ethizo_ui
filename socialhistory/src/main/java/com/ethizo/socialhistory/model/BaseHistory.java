package com.ethizo.socialhistory.model;

import com.ethizo.socialhistory.utilities.Constants;
import com.google.gson.annotations.SerializedName;

public class BaseHistory {

    public String pid, section;
    public int confidential;

    @SerializedName("daily_use")
    public boolean dailyUse;
    @SerializedName("sub_section")
    public String subSection;
    @SerializedName("history_type")
    public String historyType;
    @SerializedName("json_data")
    public Object data;

    protected boolean strToBool(String value){
        if(value == null)
            return false;
        return value.equalsIgnoreCase(Constants.YES);
    }

    protected String boolToStr(boolean value){
        return value ? Constants.YES : Constants.NO;
    }

}
