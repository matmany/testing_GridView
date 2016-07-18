package com.example_frag2.mamani.testing_gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int image = R.drawable.gsa_chair_empty;
        GridView gr = (GridView) findViewById(R.id.gridView);
    }


}
