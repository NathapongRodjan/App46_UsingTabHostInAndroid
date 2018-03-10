package com.example.nathapong.app46_usingtabhostinandroid;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends ActivityGroup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup(getLocalActivityManager());

        // Tab 1
        TabHost.TabSpec spec = tabHost.newTabSpec("ONE");
        //spec.setIndicator("TAB ONE");
        spec.setIndicator("",getResources().getDrawable(R.drawable.bear));
        Intent intent1 = new Intent(MainActivity.this, FirstTabActivity.class);
        spec.setContent(intent1);
        tabHost.addTab(spec);


        // Tab 2
        spec = tabHost.newTabSpec("TWO");
        //spec.setIndicator("TAB TWO");
        spec.setIndicator("",getResources().getDrawable(R.drawable.bird));
        Intent intent2 = new Intent(MainActivity.this, SecondTabActivity.class);
        spec.setContent(intent2);
        tabHost.addTab(spec);


        // Tab 3
        spec = tabHost.newTabSpec("THREE");
        //spec.setIndicator("TAB THREE");
        spec.setIndicator("",getResources().getDrawable(R.drawable.cat));
        Intent intent3 = new Intent(MainActivity.this, ThirdTabActivity.class);
        spec.setContent(intent3);
        tabHost.addTab(spec);

        // Tab 4
        spec = tabHost.newTabSpec("FOUR");
        //spec.setIndicator("TAB THREE");
        spec.setIndicator("",getResources().getDrawable(R.drawable.cat));
        Intent intent4 = new Intent(MainActivity.this, ThirdTabActivity.class);
        spec.setContent(intent4);
        tabHost.addTab(spec);

        // Tab 5
        spec = tabHost.newTabSpec("FIVE");
        //spec.setIndicator("TAB THREE");
        spec.setIndicator("",getResources().getDrawable(R.drawable.cat));
        Intent intent5 = new Intent(MainActivity.this, ThirdTabActivity.class);
        spec.setContent(intent5);
        tabHost.addTab(spec);

    }
}
