package ru.samsung.itschool.magicball;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tap(View view) {

        TextView text = (TextView) this.findViewById(R.id.message);

        Animation in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        text.startAnimation(in);

        int res = (int) (Math.random() * 3);

        /*********************************
         //TYPE YOUR MAGIC CODE HERE
         //JUST AMAZING switch & case
         //USE strings.xml's POWER
         *********************************/
        text.setText(R.string.stub);
    }
}
