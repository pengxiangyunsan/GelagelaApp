package com.tw.flag.gelagela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }
    public void goBack(View v)
    {
        finish();
    }
}
