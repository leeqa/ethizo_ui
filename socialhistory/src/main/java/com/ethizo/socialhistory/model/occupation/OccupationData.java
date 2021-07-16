package com.ethizo.socialhistory.model.occupation;
import com.google.gson.annotations.SerializedName;
public class OccupationData {

    public String updated;

    @SerializedName("employment")
    public String Employment;
    @SerializedName("phone")
    public String Phone;
    @SerializedName("phone_ext")
    public String PhoneExt;
    @SerializedName("occupation")
    public String Occupation;
    @SerializedName("status")
    public String Status;
    @SerializedName("restrictions")
    public String Restrictions;
    @SerializedName("retired")
    public String Retired;

}
