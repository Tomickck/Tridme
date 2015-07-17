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
import android.widget.TextView;
import android.widget.Toast;

/**
 * Project TridmeOdpad - kopie
 * Created by Tomáš Vítek on 11. 7. 2015.
 */
public class Papir extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_information);


        setTitle("Papir");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.papir)));


        TextView inf = (TextView)findViewById(R.id.infotxt);
        TextView pat = (TextView)findViewById(R.id.patri);
        TextView nepat = (TextView)findViewById(R.id.nepatri);

        inf.setText("Patří do modrého kontejneru. Ze všech tříděných odpadů právě papíru vyprodukuje průměrná česká domácnost za rok hmotnostně nejvíc. Modré kontejnery na papír bývají nejsnazším způsobem, jak se ho správně zbavit. Alternativu pak poskytují sběrné suroviny, které nejsou vždy dostupné, na druhou stranu nabízejí za papír roztříděný podle druhů finanční odměnu.");
        pat.setText("Vhodit sem můžeme například časopisy, noviny, sešity, krabice, papírové obaly, cokoliv z lepenky, nebo knihy. Obálky s fóliovými okénky sem můžete také vhazovat, Nevadí ani papír s kancelářskými sponkami. Zpracovatelé si s nimi umí poradit. Bublinkové obálky vhazujeme pouze bez plastového vnitřku!");
        nepat.setText("Do modrého kontejneru nepatří celé svazky knih (vhazovat pouze bez vazby, ve větším počtu patří na sběrný dvůr), uhlový, mastný nebo jakkoliv znečištěný papír. Tyto materiály nelze už nadále recyklovat. Pozor, použité dětské pleny opravdu nepatří do kontejneru na papír, ale do popelnice!");
    }

}