package com.ethizo.socialhistory.model;

import com.ethizo.socialhistory.utilities.Constants;
import com.google.gson.annotations.SerializedName;

public abstract class BaseHistory<T> {
    public String pid, section;
    public int confidential;

    @SerializedName("daily_use")
    public boolean dailyUse;
    @SerializedName("sub_section")
    public String subSection;
    @SerializedName("history_type")
    public String historyType;
    @SerializedName("json_data")
    public T data;
}
