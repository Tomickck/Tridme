package com.tomiktuts.tridmeodpad;

import android.R;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

public class BaseActivity extends ActionBarActivity {

	public static final String KEY_SCORE = "key_score";

	protected int mCurrentScore = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		
		Bundle bu = getIntent().getExtras();
		// podminka jestli promena bu neni rovna null
		// protoze ty parametry do aktivity neposilas, proto je tam null, jakoby nic
		if(bu != null) {
			mCurrentScore = bu.getInt(KEY_SCORE);
			Log.d("QuestionAct"," score "+mCurrentScore);
		}
	}
	// ta posledni 0 je teda spatne jo?
	// dost pravdepodobne.-... mela tam zusttat 9 a ne 0 a muzes mi prosim vyslvetlit co znamena toto ? uz to diky tomu nepada 
		 public Bundle getBundleData() {
			 // ne tam to jen prepsat na 
			 // tak to je pak ok
				Bundle bu = new Bundle();
				
		        bu.putInt(BaseActivity.KEY_SCORE, mCurrentScore);  
		        Log.d("QuestionAct"," score "+mCurrentScore);
				return bu;
}

		 // hello :)
		 // kde je ta moje BaseActivity?
	// zkus
	
		 
}