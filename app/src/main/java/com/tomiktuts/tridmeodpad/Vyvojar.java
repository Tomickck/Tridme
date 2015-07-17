package com.tomiktuts.tridmeodpad;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
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
import android.widget.Toast;

public class Vyvojar extends ActionBarActivity {

	Button fbbtn,ytbtn,instbtn,andbtn;

	@Override
	public void onBackPressed() {
		super.onBackPressed();
 		overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
			}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vyvojar);
setTitle("Vývojář");



		fbbtn=(Button)findViewById(R.id.fbbtn);
		ytbtn=(Button)findViewById(R.id.ytbtn);
		instbtn=(Button)findViewById(R.id.instbtn);
		andbtn=(Button)findViewById(R.id.andbtn);

		StateListDrawable states =new StateListDrawable();
		states.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#0D47A1")));
		states.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#0D47A1")));
		states.addState(new int[]{}, new ColorDrawable(Color.parseColor("#1E88E5")));
		fbbtn.setBackground(states);

		StateListDrawable states2 =new StateListDrawable();
		states2.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#D50000")));
		states2.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#D50000")));
		states2.addState(new int[]{}, new ColorDrawable(Color.parseColor("#CD332D")));
		ytbtn.setBackground(states2);

		StateListDrawable states3 =new StateListDrawable();
		states3.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#33691E")));
		states3.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#33691E")));
		states3.addState(new int[]{}, new ColorDrawable(Color.parseColor("#A4C639")));
		andbtn.setBackground(states3);

		StateListDrawable states4 =new StateListDrawable();
		states4.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(Color.parseColor("#006064")));
		states4.addState(new int[] {android.R.attr.state_focused}, new ColorDrawable(Color.parseColor("#006064")));
		states4.addState(new int[]{}, new ColorDrawable(Color.parseColor("#517fa4")));
		instbtn.setBackground(states4);
        }

    public void onFacebook(View view){
    	final ProgressDialog ringProgressDialog = ProgressDialog.show(Vyvojar.this,"Počkejte prosím ..." ,	"Facebook se načítá ...", true);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3500);
				} catch (Exception e) {

				}
				ringProgressDialog.dismiss();
			}
		}).start();
  	  try {
		    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003718085002"));
		    startActivity(intent);
		} catch(Exception e) {
		    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/tomik.vitek")));
		}
    }
    
 public void onYoutube(View view){
	 final ProgressDialog ringProgressDialog = ProgressDialog.show(Vyvojar.this,"Počkejte prosím ..." ,	"Youtube se načítá ...", true);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3500);
				} catch (Exception e) {

				}
				ringProgressDialog.dismiss();
			}
		}).start();
		  try {
			  String id = "youtube.com/user/xXVITOMXx";
				 Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + id));
				 startActivity(intent);
			} catch(Exception e) {
			    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UClCqxKAbjGhFmr7SYXazJ9Q")));
			}
	
    }
 public void onInstagram(View view){
	 Uri uri = Uri.parse("http://instagram.com/_u/tomickck");
	    Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

	    likeIng.setPackage("com.instagram.android");
	    final ProgressDialog ringProgressDialog = ProgressDialog.show(Vyvojar.this,"Počkejte prosím ..." ,	"Instagram se načítá ...", true);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3500);
				} catch (Exception e) {

				}
				ringProgressDialog.dismiss();
			}
		}).start();
	    try {
	        startActivity(likeIng);
	    } catch (ActivityNotFoundException e) {
	        startActivity(new Intent(Intent.ACTION_VIEW,
	                Uri.parse("https://instagram.com/tomickck")));
	    }
		 
		}
	  
 public void onAndroid(View view){
	 final ProgressDialog ringProgressDialog = ProgressDialog.show(Vyvojar.this,"Počkejte prosím ..." ,	"Google Play se načítá ...", true);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3500);
				} catch (Exception e) {

				}
				ringProgressDialog.dismiss();
			}
		}).start();
	 try {
	        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Tomáš+Vítek"));
	        startActivity(intent);
	    } catch(Exception e) {
	        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Tom%C3%A1%C5%A1+V%C3%ADtek")));
	    }
 }
	   
	   
	}
