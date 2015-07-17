package com.tomiktuts.tridmeodpad;

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
public class Bioodpad extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);
        setTitle("Bioodpad");

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.bioodpad)));

        TextView inf = (TextView)findViewById(R.id.infotxt);
        TextView pat = (TextView)findViewById(R.id.patri);
        TextView nepat = (TextView)findViewById(R.id.nepatri);
        TextView ano = (TextView)findViewById(R.id.fd);
        TextView ne = (TextView)findViewById(R.id.fdf);

        ano.setVisibility(View.INVISIBLE);
        ne.setVisibility(View.INVISIBLE);
        inf.setText("Jedná se o biologicky rozložitelný odpad pocházející především z údržby zahrad, ale i kuchyní. Některé obce a města v ČR organizují pro své občany jejich oddělený sběr. K tomuto sběru se pak nejčastěji využívají hnědé odvětrávané popelnice, nebo mobilní sběry, případně je možné je odkládat na sběrném dvoře. Bioodpady je také možné jako jediné legálně využít na zahradách v zahradních kompostérech nebo komunitních a obecních kompostárnách");
        pat.setText("");
        nepat.setText("");

    }

}