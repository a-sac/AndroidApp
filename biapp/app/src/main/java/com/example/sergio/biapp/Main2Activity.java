package com.example.sergio.biapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView)findViewById(R.id.photo1);
        TextView textView = (TextView)findViewById(R.id.textp1);

        /*ImageView img = (ImageView)findViewById(R.drawable.camera);
        Bitmap myBitmap = ((BitmapDrawable)img.getDrawable()).getBitmap();*/
        textView.setText(getIntent().getStringExtra("Name"));
        Bitmap bitmap = (Bitmap) getIntent().getParcelableExtra("Photo");

        imageView.setImageBitmap(bitmap);
    }
}
