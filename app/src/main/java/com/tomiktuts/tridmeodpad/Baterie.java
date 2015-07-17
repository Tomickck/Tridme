package com.tomiktuts.tridmeodpad;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Project TridmeOdpad - kopie
 * Created by Tomáš Vítek on 11. 7. 2015.
 */
public class Baterie extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);
        setTitle("Elektrické zařízení");

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.baterie)));


        TextView inf = (TextView)findViewById(R.id.infotxt);
        TextView pat = (TextView)findViewById(R.id.patri);
        TextView nepat = (TextView)findViewById(R.id.nepatri);
        TextView ano = (TextView)findViewById(R.id.fd);
        TextView ne = (TextView)findViewById(R.id.fdf);

        ano.setVisibility(View.INVISIBLE);
        ne.setVisibility(View.INVISIBLE);
        inf.setText("Staré a nefunkční elektrické spotřebiče podléhají tzv. „zpětnému odběru\", který zajišťují specializované firmy. Místa, kde můžete zdarma odkládat takové vysloužilé výrobky, jsou označována jako „Místa zpětného odběru\".");
        pat.setText("");
        nepat.setText("");

    }

}