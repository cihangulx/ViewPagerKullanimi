package com.cihangul.metahan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Cihan on 11.11.2016.
 */

public class Sayfa4 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sayfa4,container,false);
        //ekleyeceğin görsel elamnları bu view ile ekleyeceksin
        TextView textView = (TextView) view.findViewById(R.id.textView4);
        //Bu kısımdan sonra textView.setText diyerek işlemlerini yapabilirsin

        return view;
    }
}
