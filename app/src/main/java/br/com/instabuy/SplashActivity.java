package br.com.instabuy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
/**
 * Created by Ronan Lima on 10/02/2016.
 */
public class SplashActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);

        Thread background = new Thread() {
            public void run() {

                try {

                    sleep(5 * 1000);

                    Intent i = new Intent(getBaseContext(), MainActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                    finish();

                } catch (Exception e) {

                    Log.e(TAG, e.getMessage());

                }
            }
        };

        background.start();

    }
}

