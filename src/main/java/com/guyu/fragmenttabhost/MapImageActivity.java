package com.guyu.fragmenttabhost;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fragmenttabhost.R;

/**
 * Created by Administrator on 2016/6/3.
 */
public class MapImageActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapimage);
        String lat= getIntent().getExtras().getString("thinglat");
        ((TextView)findViewById(R.id.tv)).setText(lat);
    }

}
