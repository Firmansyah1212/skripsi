package com.example.firmanskripsi.dialog;

import android.app.ProgressDialog;
import android.content.Context;


public class MobiProgressBar extends ProgressDialog {

    /**
     * @param context
     */
    public MobiProgressBar(Context context) {
        super(context);
        setProgressStyle(STYLE_HORIZONTAL);
    }

}