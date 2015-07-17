package com.tomiktuts.tridmeodpad;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Project TridmeOdpad - kopie
 * Created by Tomáš Vítek on 11. 7. 2015.
 */
public class Sklo extends ActionBarActivity {

TextView inf,pat,nepat,mat;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);


        setTitle("Sklo");
              android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.sklo)));


        inf = (TextView)findViewById(R.id.infotxt);
    pat = (TextView)findViewById(R.id.patri);
    nepat = (TextView)findViewById(R.id.nepatri);

        inf.setText("Vhazuje se do zeleného nebo bílého kontejneru. Pokud jsou k dispozici oba, je důležité třídit sklo i podle barev: Barevné do zeleného, čiré do bílého. Pokud máte kontejner na sklo jen jeden, pak do něj dávejte sklo bez ohledu na barvu. Vytříděné sklo není nutné rozbíjet, bude se dále třídit! Díky svým vlastnostem se dá skleněný odpad recyklovat do nekonečna.");
        pat.setText("Do zeleného kontejneru můžeme vhazovat barevné sklo, například lahve od vína, alkoholických i nealkoholických nápojů. Vhodit do zeleného kontejneru můžete také tabulové sklo z oken a ze dveří.\n" +
                "\n" +
                "Do bílého kontejneru vhazujte sklo čiré, tedy sklenice od kečupů, marmelád či zavařenin a rozbité skleničky.");
        nepat.setText("Do těchto nádob nepatří keramika a porcelán. Nepatří sem ani autosklo, zrcadla nebo třeba drátované sklo, zlacená a pokovená skla. Vratné zálohované sklo vracejte zpět do obchodu.");

    }
}

