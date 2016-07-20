package com.example_frag2.mamani.testing_gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewAnimator;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

         //int image = R.drawable.gsa_chair_empty;
         int image = R.layout.caderno_image;

        int[] lista = new int[]{
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                image,image,image,image,image,image,image,image,image,
                };


        GridView gr = (GridView) findViewById(R.id.gridView);

        gr.setAdapter(new Adaptador(this,lista));

        gr.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,""+i,Toast.LENGTH_SHORT).show();
            }
        });

    }


}
