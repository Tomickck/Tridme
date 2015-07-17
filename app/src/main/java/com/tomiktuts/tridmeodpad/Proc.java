package com.tomiktuts.tridmeodpad;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Project TridmeOdpad - kopie
 * Created by Tomáš Vítek on 12. 7. 2015.
 */
public class Proc extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.podminka);

        setTitle("Proč třídit ?");

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.proc)));


    }
}
