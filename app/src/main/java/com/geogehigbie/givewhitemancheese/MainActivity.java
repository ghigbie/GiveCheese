package com.geogehigbie.givewhitemancheese;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animateCow();
    }

    public void animateCow(){

        ImageView cowImage = (ImageView) findViewById(R.id.cow1);

        ObjectAnimator yAnim = ObjectAnimator.ofFloat(cowImage, "y",
                cowImage.getY(), cowImage.getHeight() - 50f);
        yAnim.setDuration(1500);
        yAnim.setRepeatCount(20);
        yAnim.setRepeatMode(ValueAnimator.REVERSE);
        yAnim.setInterpolator(new AccelerateInterpolator(2f));
        //yAnim.addUpdateListener(this);
        //yAnim.addListener(this);
        yAnim.start();
    }
}
