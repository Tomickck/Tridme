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
public class Kovy extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);

        setTitle("Kovy");

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.kovy)));

        TextView inf = (TextView)findViewById(R.id.infotxt);
        TextView pat = (TextView)findViewById(R.id.patri);
        TextView nepat = (TextView)findViewById(R.id.nepatri);
        TextView ano = (TextView)findViewById(R.id.fd);
        TextView ne = (TextView)findViewById(R.id.fdf);
        ano.setVisibility(View.INVISIBLE);
        ne.setVisibility(View.INVISIBLE);

        inf.setText("Kovy jsou ceněnou surovinou pro další výrobu, proto jejich sběr probíhá prostřednictvím výkupen druhotných surovin, kde za ně dostanete peníze, někde formou vyhlášených svozů „železná neděle\" nebo také pomocí sběrných dvorů.\n" +
                "\n" +
                "Do sběrných surovin bychom neměli nosit plechovky od barev a jiných nebezpečných látek, domácí spotřebiče a jiná vysloužilá zařízení složená z více materiálů a to ani jejich demontované části. Na sběr všech těchto odpadů slouží sběrné dvory. Samostatnou kapitolu tvoří autovraky, jež převezmou a doklad o ekologické likvidaci vystaví na vrakovištích.");
        pat.setText("");
        nepat.setText("");
    }
}