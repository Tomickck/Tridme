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
public class Plast extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);

        setTitle("Plast");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.plast)));


        TextView inf = (TextView)findViewById(R.id.infotxt);
        TextView pat = (TextView)findViewById(R.id.patri);
        TextView nepat = (TextView)findViewById(R.id.nepatri);

        inf.setText("Patří do žlutého kontejneru. V průměrné české popelnici zabírají nejvíc místa ze všech odpadů, proto je nejenom důležité jejich třídění, ale i sešlápnutí či zmačkání před vyhozením. V některých městech a obcích se spolu s pastovým odpadem třídí i nápojové kartony. Záleží na podmínkách a technickém vybavení třídících linek v okolí. Proto je důležité sledovat nálepky na jednotlivých kontejnerech. Mimo níže uvedených značek do těchto kontejnerů můžete vyhazovat i odpady označení číslem 7.");
        pat.setText("Do kontejnerů na plasty patří fólie, sáčky, plastové tašky, sešlápnuté PET láhve, obaly od pracích, čistících a kosmetických přípravků, kelímky od jogurtů, mléčných výrobků, balící fólie od spotřebního zboží, obaly od CD disků a další výrobky z plastů.");
        nepat.setText("Naopak sem nepatří mastné obaly se zbytky potravin nebo čistících přípravků, obaly od žíravin, barev a jiných nebezpečných látek, podlahové krytiny či novodurové trubky.");
    }

}