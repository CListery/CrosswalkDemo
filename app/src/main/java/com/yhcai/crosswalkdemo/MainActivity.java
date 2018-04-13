package com.yhcai.crosswalkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import org.xwalk.core.XWalkView;


public class MainActivity extends Activity {

    private XWalkView mXWalkView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mXWalkView = findViewById(R.id.activity_main);
        mXWalkView.loadUrl("http://crosswalk-project.org/");

    }
}
