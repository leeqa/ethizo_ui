package com.ethizo.socialhistory.utilities;

import android.content.Context;
import android.util.AttributeSet;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

/**
 * Created by kamran on 1/25/2017.
 */

public class MaterialSpinner extends MaterialBetterSpinner {
    public MaterialSpinner(Context context) {
        super(context);
    }

    public MaterialSpinner(Context arg0, AttributeSet arg1) {
        super(arg0, arg1);
    }

    public MaterialSpinner(Context arg0, AttributeSet arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    /**
     * to get selected text from spinner
     *
     * @return selected text on spinner
     */
    public String getSelectedText() {
        String text = "";
        text = getText().toString() + "";
        return text;
    }

}
