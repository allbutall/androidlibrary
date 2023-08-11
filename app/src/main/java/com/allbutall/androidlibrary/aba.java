package com.allbutall.androidlibrary;

import android.content.Context;
import android.widget.Toast;

public class aba {

    public static Void SimpleToaster(Context ctx, String msg, String duration) {
        if (duration == "SHORT")
        {
            Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
        } else if (duration == "LONG") {
            Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show();
        }
        return null;

    }
}
