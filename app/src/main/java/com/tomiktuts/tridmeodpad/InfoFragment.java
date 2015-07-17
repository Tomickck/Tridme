package com.tomiktuts.tridmeodpad;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Project TridmeOdpad - kopie
 * Created by Tomáš Vítek on 11. 7. 2015.
 */
public class InfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.more_information, container, false);
    }
}