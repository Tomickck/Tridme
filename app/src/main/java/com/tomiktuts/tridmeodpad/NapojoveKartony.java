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
public class NapojoveKartony extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);

        setTitle("Nápojové kartony");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.kartony)));

        TextView inf = (TextView)findViewById(R.id.infotxt);
        TextView pat = (TextView)findViewById(R.id.patri);
        TextView nepat = (TextView)findViewById(R.id.nepatri);
        inf.setText("Známý jako krabice na mléko nebo víno. Vhazují se do kontejnerů různých barev a tvarů, ale vždy označených oranžovou nálepkou - případně do oranžových pytlů. Záleží na tom, jak má obec systém sběru nápojových kartonů nastavený.");
        pat.setText("Pokud najdete oranžovou nálepku, pak sem patří krabice od džusů, vína, mléka a mléčných výrobků, které je potřeba před vhozením do kontejneru řádně sešlápnout.");
        nepat.setText("Nepatří sem „měkké\" sáčky, například od kávy a různých potravin v prášku. Neodhazujte sem ani nápojové kartony obsahující zbytky nápojů a potravin.");
    }

}