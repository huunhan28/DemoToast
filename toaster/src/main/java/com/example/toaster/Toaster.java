package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void toast(Context context, String message) {
        Toast.makeText(context, "Hello from Toaster!" + message, Toast.LENGTH_SHORT).show();
    }
}
