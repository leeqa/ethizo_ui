package com.ethizo.socialhistory.utilities;

public class Utils {

    public static boolean strToBool(String value){
        if(value == null)
            return false;
        return value.equalsIgnoreCase(Constants.YES);
    }

    public static String boolToStr(boolean value){
        return value ? Constants.YES : Constants.NO;
    }
}
