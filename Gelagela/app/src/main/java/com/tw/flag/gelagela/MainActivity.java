package com.tw.flag.gelagela;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoSecondActivity(View v)
    {
        Intent it =new Intent(this,SecondActivity.class);
        startActivity(it);
    }

    public void gotoThirdActivity(View v)
    {
        Intent it =new Intent(this,ThirdActivity.class);
        startActivity(it);
    }

    public void gotoForthActivity(View v)
    {
        Intent it =new Intent(this,ForthActivity.class);
        startActivity(it);
    }
    public void gotoFifthActivity(View v)
    {
        Intent it =new Intent(this,FifthActivity.class);
        startActivity(it);
    }



}
