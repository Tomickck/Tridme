package com.tomiktuts.tridmeodpad;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JakTridit extends ActionBarActivity{
	android.support.v4.app.Fragment newFragment;
	boolean mIsDualPane;
	Button sklo,plast,papir,kartony,kovy,odpad,baterie,bioodpad;


	@Override
	public void onBackPressed() {
		super.onBackPressed();
 		overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
			}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jaktridit);

		sklo=(Button)findViewById(R.id.add);
		plast=(Button)findViewById(R.id.button9);
		papir=(Button)findViewById(R.id.button8);
		kartony=(Button)findViewById(R.id.button7);
		kovy=(Button)findViewById(R.id.button6);
		odpad=(Button)findViewById(R.id.button4);
		baterie=(Button)findViewById(R.id.button3);
		bioodpad=(Button)findViewById(R.id.download);

		StateListDrawable states =new StateListDrawable();
		states.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#1B5E20")));
		states.addState(new int[]{android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#1B5E20")));
		states.addState(new int[]{}, new ColorDrawable(Color.parseColor("#43A047")));
		sklo.setBackground(states);

		StateListDrawable states2 =new StateListDrawable();
		states2.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#FFD600")));
		states2.addState(new int[]{android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#FFD600")));
		states2.addState(new int[]{}, new ColorDrawable(Color.parseColor("#FFEA00")));
		plast.setBackground(states2);


		StateListDrawable states3 =new StateListDrawable();
		states3.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#0D47A1")));
		states3.addState(new int[]{android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#0D47A1")));
		states3.addState(new int[]{}, new ColorDrawable(Color.parseColor("#1976D2")));
		papir.setBackground(states3);

		StateListDrawable states4 =new StateListDrawable();
		states4.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#E65100")));
		states4.addState(new int[]{android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#E65100")));
		states4.addState(new int[]{}, new ColorDrawable(Color.parseColor("#EF6C00")));
		kartony.setBackground(states4);

		StateListDrawable states5 =new StateListDrawable();
		states5.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#757575")));
		states5.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#757575")));
		states5.addState(new int[]{}, new ColorDrawable(Color.parseColor("#BDBDBD")));
		kovy.setBackground(states5);


		StateListDrawable states6 =new StateListDrawable();
		states6.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#B71C1C")));
		states6.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#B71C1C")));
		states6.addState(new int[]{}, new ColorDrawable(Color.parseColor("#D32F2F")));
		odpad.setBackground(states6);

		StateListDrawable states7 =new StateListDrawable();
		states7.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#4A148C")));
		states7.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#4A148C")));
		states7.addState(new int[]{}, new ColorDrawable(Color.parseColor("#7B1FA2")));
		baterie.setBackground(states7);

		StateListDrawable states8 =new StateListDrawable();
		states8.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#4E342E")));
		states8.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#4E342E")));
		states8.addState(new int[]{}, new ColorDrawable(Color.parseColor("#5D4037")));
		bioodpad.setBackground(states8);





		View articleView = findViewById(R.id.typ);
		mIsDualPane = articleView != null &&
				articleView.getVisibility() == View.VISIBLE;

		if (mIsDualPane) {

			setTitle("Sklo");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.sklo)));
		}
	}
	public void onSklo(View view){
		if(mIsDualPane){

			setTitle("Sklo");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.sklo)));



			TextView inf = (TextView) findViewById(R.id.infotxt);
			TextView pat = (TextView) findViewById(R.id.patri);
			TextView nepat = (TextView)findViewById(R.id.nepatri);
			inf.setText("Vhazuje se do zeleného nebo bílého kontejneru. Pokud jsou k dispozici oba, je důležité třídit sklo i podle barev: Barevné do zeleného, čiré do bílého. Pokud máte kontejner na sklo jen jeden, pak do něj dávejte sklo bez ohledu na barvu. Vytříděné sklo není nutné rozbíjet, bude se dále třídit! Díky svým vlastnostem se dá skleněný odpad recyklovat do nekonečna.");
			pat.setText("Do zeleného kontejneru můžeme vhazovat barevné sklo, například lahve od vína, alkoholických i nealkoholických nápojů. Vhodit do zeleného kontejneru můžete také tabulové sklo z oken a ze dveří.\n" +
					"\n" +
					"Do bílého kontejneru vhazujte sklo čiré, tedy sklenice od kečupů, marmelád či zavařenin a rozbité skleničky.");
			nepat.setText("Do těchto nádob nepatří keramika a porcelán. Nepatří sem ani autosklo, zrcadla nebo třeba drátované sklo, zlacená a pokovená skla. Vratné zálohované sklo vracejte zpět do obchodu.");

		}else{

			startActivity(new Intent(JakTridit.this,Sklo.class));
			overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_fade_out);
		}

	}

	public void onPlast (View view){
		if(mIsDualPane){
			TextView inf = (TextView)findViewById(R.id.infotxt);
			TextView pat = (TextView)findViewById(R.id.patri);
			TextView nepat = (TextView)findViewById(R.id.nepatri);
			setTitle("Plast");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.plast)));
			inf.setText("Patří do žlutého kontejneru. V průměrné české popelnici zabírají nejvíc místa ze všech odpadů, proto je nejenom důležité jejich třídění, ale i sešlápnutí či zmačkání před vyhozením. V některých městech a obcích se spolu s pastovým odpadem třídí i nápojové kartony. Záleží na podmínkách a technickém vybavení třídících linek v okolí. Proto je důležité sledovat nálepky na jednotlivých kontejnerech. Mimo níže uvedených značek do těchto kontejnerů můžete vyhazovat i odpady označení číslem 7.");
			pat.setText("Do kontejnerů na plasty patří fólie, sáčky, plastové tašky, sešlápnuté PET láhve, obaly od pracích, čistících a kosmetických přípravků, kelímky od jogurtů, mléčných výrobků, balící fólie od spotřebního zboží, obaly od CD disků a další výrobky z plastů.");
			nepat.setText("Naopak sem nepatří mastné obaly se zbytky potravin nebo čistících přípravků, obaly od žíravin, barev a jiných nebezpečných látek, podlahové krytiny či novodurové trubky.");
		}else{
			startActivity(new Intent(JakTridit.this, Plast.class));
			overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
		}
	}
	public void onPapír (View view){
		if(mIsDualPane){
			TextView inf = (TextView)findViewById(R.id.infotxt);
			TextView pat = (TextView)findViewById(R.id.patri);
			TextView nepat = (TextView)findViewById(R.id.nepatri);
			setTitle("Papír");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.papir)));
			inf.setText("Patří do modrého kontejneru. Ze všech tříděných odpadů právě papíru vyprodukuje průměrná česká domácnost za rok hmotnostně nejvíc. Modré kontejnery na papír bývají nejsnazším způsobem, jak se ho správně zbavit. Alternativu pak poskytují sběrné suroviny, které nejsou vždy dostupné, na druhou stranu nabízejí za papír roztříděný podle druhů finanční odměnu.");
			pat.setText("Vhodit sem můžeme například časopisy, noviny, sešity, krabice, papírové obaly, cokoliv z lepenky, nebo knihy. Obálky s fóliovými okénky sem můžete také vhazovat, Nevadí ani papír s kancelářskými sponkami. Zpracovatelé si s nimi umí poradit. Bublinkové obálky vhazujeme pouze bez plastového vnitřku!");
			nepat.setText("Do modrého kontejneru nepatří celé svazky knih (vhazovat pouze bez vazby, ve větším počtu patří na sběrný dvůr), uhlový, mastný nebo jakkoliv znečištěný papír. Tyto materiály nelze už nadále recyklovat. Pozor, použité dětské pleny opravdu nepatří do kontejneru na papír, ale do popelnice!");
		}else{
			startActivity(new Intent(JakTridit.this, Papir.class));
			overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
		}
	}
	public void onNapojoveKartony (View view){
		if(mIsDualPane){
			TextView inf = (TextView)findViewById(R.id.infotxt);
			TextView pat = (TextView)findViewById(R.id.patri);
			TextView nepat = (TextView)findViewById(R.id.nepatri);
			setTitle("Nápojové kartony");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.kartony)));
			inf.setText("Známý jako krabice na mléko nebo víno. Vhazují se do kontejnerů různých barev a tvarů, ale vždy označených oranžovou nálepkou - případně do oranžových pytlů. Záleží na tom, jak má obec systém sběru nápojových kartonů nastavený.");
			pat.setText("Pokud najdete oranžovou nálepku, pak sem patří krabice od džusů, vína, mléka a mléčných výrobků, které je potřeba před vhozením do kontejneru řádně sešlápnout.");
			nepat.setText("Nepatří sem „měkké\" sáčky, například od kávy a různých potravin v prášku. Neodhazujte sem ani nápojové kartony obsahující zbytky nápojů a potravin.");
		}else{
			startActivity(new Intent(JakTridit.this, NapojoveKartony.class));
			overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
		}
	}
	public void onKovy (View view){
		if(mIsDualPane){

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
		}else{
			startActivity(new Intent(JakTridit.this,Kovy.class));
			overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
		}
	}
	public void onNebezpecnyOdpad (View view){
		if(mIsDualPane){
			TextView inf = (TextView)findViewById(R.id.infotxt);
			TextView pat = (TextView)findViewById(R.id.patri);
			TextView nepat = (TextView)findViewById(R.id.nepatri);
			TextView ano = (TextView)findViewById(R.id.fd);
			TextView ne = (TextView)findViewById(R.id.fdf);

			setTitle("Nebezpečný odpad");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.odpad)));

			ano.setVisibility(View.INVISIBLE);
			ne.setVisibility(View.INVISIBLE);

			inf.setText("Tyto odpady, nebo obaly jimi znečištěné mají nebezpečné vlastnosti, které mohou ohrozit zdraví lidí a životní prostředí. Proto musí být využity, či odstraněny ve speciálních zařízeních. Tyto odpady nepatří do běžné popelnice na směsný odpad. Jedná se např. o: Barvy, lepidla, rozpouštědla, oleje, pesticidy, léky a domácí chemikálie\n" +
					"Nebezpečné odpady můžete odkládat do sběrného dvora, nebo využít mobilního sběru, pokud je obcí organizován. Když si nevíte rady s nějakým prázdným obalem, podívejte se na jeho etiketu, vždy by měla být na jeho obalu informace, jak s daným obsahem naložit. Staré léky můžete vrátit do jakékoliv lékárny.");
			pat.setText("");
			nepat.setText("");
		}else{
			startActivity(new Intent(JakTridit.this,NebezpecnyOdpad.class));
			overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
		}
	}
	public void onBaterie (View view){
		if(mIsDualPane){

			TextView inf = (TextView)findViewById(R.id.infotxt);
			TextView pat = (TextView)findViewById(R.id.patri);
			TextView nepat = (TextView)findViewById(R.id.nepatri);

			TextView ano = (TextView)findViewById(R.id.fd);
			TextView ne = (TextView)findViewById(R.id.fdf);

			ano.setVisibility(View.INVISIBLE);
			ne.setVisibility(View.INVISIBLE);
			setTitle("Elektrická zařízení");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.baterie)));
			inf.setText("Staré a nefunkční elektrické spotřebiče podléhají tzv. „zpětnému odběru\", který zajišťují specializované firmy. Místa, kde můžete zdarma odkládat takové vysloužilé výrobky, jsou označována jako „Místa zpětného odběru\".");
			pat.setText("");
			nepat.setText("");


		}else{
			startActivity(new Intent(JakTridit.this,Baterie.class));
			overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
		}

	}
	public void onBioodpad (View view){
		if(mIsDualPane){
			TextView inf = (TextView)findViewById(R.id.infotxt);
			TextView pat = (TextView)findViewById(R.id.patri);
			TextView nepat = (TextView)findViewById(R.id.nepatri);
			setTitle("Bioodpad");
			android.support.v7.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(getResources()
					.getColor(R.color.bioodpad)));
			TextView ano = (TextView)findViewById(R.id.fd);
			TextView ne = (TextView)findViewById(R.id.fdf);

			ano.setVisibility(View.INVISIBLE);
			ne.setVisibility(View.INVISIBLE);

			inf.setText("Jedná se o biologicky rozložitelný odpad pocházející především z údržby zahrad, ale i kuchyní. Některé obce a města v ČR organizují pro své občany jejich oddělený sběr. K tomuto sběru se pak nejčastěji využívají hnědé odvětrávané popelnice, nebo mobilní sběry, případně je možné je odkládat na sběrném dvoře. Bioodpady je také možné jako jediné legálně využít na zahradách v zahradních kompostérech nebo komunitních a obecních kompostárnách");
			pat.setText("");
			nepat.setText("");
		}else{
			startActivity(new Intent(JakTridit.this,Bioodpad.class));
			overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
		}
	}
}
