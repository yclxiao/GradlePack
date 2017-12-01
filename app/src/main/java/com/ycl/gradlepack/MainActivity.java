package com.ycl.gradlepack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String environment = BuildConfig.ENVIRONMENT;

        TextView textView = findViewById(R.id.mainTv);

        textView.setText(R.string.textview);

        textView.append("|" + environment);


//        BuildConfig.ENVIRONMENT;
    }
}
