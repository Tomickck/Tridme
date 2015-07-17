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
public class NebezpecnyOdpad extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);


        setTitle("Nebezpečný odpad");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.odpad)));

        TextView inf = (TextView)findViewById(R.id.infotxt);
        TextView pat = (TextView)findViewById(R.id.patri);
        TextView nepat = (TextView)findViewById(R.id.nepatri);

        TextView ano = (TextView)findViewById(R.id.fd);
        TextView ne = (TextView)findViewById(R.id.fdf);

        ano.setVisibility(View.INVISIBLE);
        ne.setVisibility(View.INVISIBLE);
        inf.setText("Tyto odpady, nebo obaly jimi znečištěné mají nebezpečné vlastnosti, které mohou ohrozit zdraví lidí a životní prostředí. Proto musí být využity, či odstraněny ve speciálních zařízeních. Tyto odpady nepatří do běžné popelnice na směsný odpad. Jedná se např. o: Barvy, lepidla, rozpouštědla, oleje, pesticidy, léky a domácí chemikálie\n" +
                "Nebezpečné odpady můžete odkládat do sběrného dvora, nebo využít mobilního sběru, pokud je obcí organizován. Když si nevíte rady s nějakým prázdným obalem, podívejte se na jeho etiketu, vždy by měla být na jeho obalu informace, jak s daným obsahem naložit. Staré léky můžete vrátit do jakékoliv lékárny.");
        pat.setText("");
        nepat.setText("");

    }

}