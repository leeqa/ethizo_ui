package com.ethizo.socialhistory.model.vaping;

import com.google.gson.annotations.SerializedName;

public class VapingModel {

    public String updated;
    @SerializedName("vaping_without_nicotine")
    public boolean vapingWithoutNicotine;
    @SerializedName("screened_for_vaping")
    public String screenedForVaping;
    public String status;
    @SerializedName("duration_age_started")
    public String durationAgeStarted;
    @SerializedName("duration_age_stopped")
    public String durationAgeStopped;
    @SerializedName("device_type")
    public String deviceType;
    @SerializedName("device_type_other")
    public String deviceTypeOther;
    public String frequency;
    @SerializedName("frequency_other")
    public String frequencyOther;
    @SerializedName("current_strength")
    public String currentStrength;
    @SerializedName("current_strength_other")
    public String currentStrengthOther;
    @SerializedName("previous_strength")
    public String previousStrength;
    @SerializedName("previous_strength_other")
    public String previousStrengthOther;
    @SerializedName("vaping_cessation_discussed")
    public String vapingCessationDiscussed;
    @SerializedName("vaping_cessation_discussed_comments")
    public String vapingCessationDiscussedComments;
    @SerializedName("vaping_comments")
    public String vapingComments;
    @SerializedName("vaping_reason")
    public String vapingReason;
    @SerializedName("vaping_reason_other")
    public String vapingReasonOther;
    @SerializedName("previous_strength_duration")
    public String previousStrengthDuration;









}
