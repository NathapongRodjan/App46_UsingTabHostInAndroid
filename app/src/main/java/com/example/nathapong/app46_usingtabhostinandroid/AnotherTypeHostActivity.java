package com.example.nathapong.app46_usingtabhostinandroid;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;


public class AnotherTypeHostActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.another_type_host);

        TabHost host = (TabHost)findViewById(R.id.tabHost2);
        host.setup();


        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("TAB 1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab 1");
        host.addTab(spec);


        //Tab 2
        spec = host.newTabSpec("TAB 2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab 2");
        host.addTab(spec);


        //Tab 3
        spec = host.newTabSpec("TAB 3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab 3");
        host.addTab(spec);

    }
}
