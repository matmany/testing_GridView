package com.example_frag2.mamani.testing_gridview;

import android.content.Context;
import android.os.Build;
import android.support.percent.PercentRelativeLayout;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by mamani on 18/07/16.
 */
public class Adaptador extends BaseAdapter {
    private Context context;
    private int[] lista;


    public Adaptador(Context ctx,int[] lista)
    {
        this.context = ctx;
        this.lista=lista;

    }


    @Override
    public int getCount() {
        return lista.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView iv = new ImageView(context);

        PercentRelativeLayout percentRelativeLayout = new PercentRelativeLayout(context);

        ViewGroup viewGroup1 = new ViewGroup(context) {
            @Override
            protected void onLayout(boolean changed, int l, int t, int r, int b) {

            }
        };


        //iv.setLayoutParams(new GridView.LayoutParams(150,100));
       // iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //iv.setPadding(4,4,4,4);


        iv.setImageResource(lista[i]);


        iv.setAdjustViewBounds(true); // ajusta o taamanho da image de acordo com a coluna

        return iv;
    }
}
