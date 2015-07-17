package com.tomiktuts.tridmeodpad;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	Button jak,proc,me,vyvojar;
	Thread thread;
	StateListDrawable states = new StateListDrawable();
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
	}

	@Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		jak=(Button)findViewById(R.id.jak);
		proc=(Button)findViewById(R.id.button4);
		me=(Button)findViewById(R.id.me);

		StateListDrawable states =new StateListDrawable();
		states.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#33691E")));
		states.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#33691E")));
		states.addState(new int[]{}, new ColorDrawable(Color.parseColor("#689F38")));
		jak.setBackground(states);

		StateListDrawable states2 =new StateListDrawable();
		states2.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#E65100")));
		states2.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#E65100")));
		states2.addState(new int[]{}, new ColorDrawable(Color.parseColor("#EF6C00")));
		proc.setBackground(states2);

		StateListDrawable states3 =new StateListDrawable();
		states3.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#311B92")));
		states3.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#311B92")));
		states3.addState(new int[]{}, new ColorDrawable(Color.parseColor("#673AB7")));
		me.setBackground(states3);





        onStartAnimations();
    }

    public void onProc(View v){
		startActivity(new Intent(MainActivity.this,Proc.class));
		overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);

	}


    public void onJak(View v){

    	startActivity(new Intent(MainActivity.this,JakTridit.class));
 		overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    public void onMe(View v){
    	startActivity(new Intent(MainActivity.this,MeTrideni.class));
 		overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
        
    	
    public void onStartAnimations(){
	   
	 	final Animation vanish = AnimationUtils.loadAnimation(this,R.anim.vanish);
	   	final Animation vanish2 = AnimationUtils.loadAnimation(this,R.anim.vanish2);
	   	final Animation vanish3 = AnimationUtils.loadAnimation(this,R.anim.vanish3);
	   	final Animation vanish4 = AnimationUtils.loadAnimation(this,R.anim.vanish4);
	   	 
	                     findViewById(R.id.jak).startAnimation(vanish);   
	                     findViewById(R.id.button4).startAnimation(vanish2);   
	                     findViewById(R.id.me).startAnimation(vanish3);
	   
   }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();

		if (id == R.id.facebook) {

			try {
				final ProgressDialog ringProgressDialog = ProgressDialog.show(MainActivity.this,"Počkejte prosím ..." ,	"Facebook se načítá ...", true);
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							Thread.sleep(5000);
						} catch (Exception e) {

						}
						ringProgressDialog.dismiss();
					}
				}).start();
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/331564513703882"));
				startActivity(intent);
			} catch(Exception e) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/tomiktuts?ref=aymt_homepage_panel")));
			}
			return true;
		}



		if (id == R.id.email) {

			Intent i = new Intent(Intent.ACTION_SEND)
					.setType("message/rfc822")
					.putExtra(Intent.EXTRA_EMAIL, new String[]{"tomas.viteck@gmail.com"})
					.putExtra(Intent.EXTRA_SUBJECT, "Třiďme odpad App");
			try {
				startActivity(Intent.createChooser(i, "Odeslat z"));
			} catch (android.content.ActivityNotFoundException ex) {
				Toast.makeText(MainActivity.this, "Nejsou nainstalovaní žádní emailový klienti.", Toast.LENGTH_SHORT).show();
			}



			return true;
		}

	if (id == R.id.person) {
		startActivity(new Intent(MainActivity.this,Vyvojar.class));
		overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
	}
	return super.onOptionsItemSelected(item);
}


}
