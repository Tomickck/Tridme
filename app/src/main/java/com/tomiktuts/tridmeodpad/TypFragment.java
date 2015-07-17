package com.tomiktuts.tridmeodpad;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Project TridmeOdpad - kopie
 * Created by Tomáš Vítek on 11. 7. 2015.
 */
public class TypFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        return inflater.inflate(
                R.layout.jaktridit, container, false);
    }
}