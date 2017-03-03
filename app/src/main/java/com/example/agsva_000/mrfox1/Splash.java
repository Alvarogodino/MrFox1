package com.example.agsva_000.mrfox1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends Activity {

    ImageView myImage;
    TextView twUemCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        myImage = (ImageView)findViewById(R.id.imageView);
        twUemCar = (TextView) findViewById(R.id.textView);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        myImage.startAnimation(myanim);
        twUemCar.startAnimation(myanim2);
        openApp(true);

        String font_path = "font/AmaticSC-Regular.ttf";

        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);

        twUemCar.setTypeface(TF);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}
