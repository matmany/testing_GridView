package com.example_frag2.mamani.testing_gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by mamani on 18/07/16.
 */
public class Adaptador extends BaseAdapter {
    private Context context;
    private int img;

    public Adaptador(Context ctx,int image)
    {
        this.context = ctx;
        this.img=image;
    }


    @Override
    public int getCount() {
        return 1;
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
        return null;
    }
}
