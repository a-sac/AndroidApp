package com.example.sergio.biapp;

import android.graphics.Bitmap;

public class DataItem {
    Bitmap resIdThumbnail;
    String Name;
    String data;

    public DataItem(Bitmap bitmap, String countryName, String data) {
        this.resIdThumbnail = bitmap;
        this.Name = countryName;
        this.data = data;
    }
}
