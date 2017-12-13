package com.vivek.android2.circularimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link of library
        // https://github.com/hdodenhof/CircleImageView

        // Limitations:

        // The ScaleType is always CENTER_CROP and you'll get an exception if you try to change it.
        // This is (currently) by design as it's perfectly fine for profile images.
        // Enabling adjustViewBounds is not supported as this requires an unsupported ScaleType
        // If you use an image loading library like Picasso or Glide, you need to disable their fade
        // animations to avoid messed up images. For Picasso use the noFade() option, for Glide use
        // dontAnimate(). If you want to keep the fadeIn animation, you have to fetch the image into
        // a Target and apply a custom animation yourself when receiving the Bitmap.
        // Using a TransitionDrawable with CircleImageView doesn't work properly and leads to messed up images.

    }
}
