package com.tomiktuts.tridmeodpad;

import java.util.ArrayList;
import java.util.List;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MeTrideni extends BaseActivity {
	
	TextView body;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metrideni); 	
        
        body=(TextView)findViewById(R.id.body);
        body.setText(""+mCurrentScore);
     Spinner spinner = (Spinner) findViewById(R.id.spinner1);
     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, R.layout.spinner_item);
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     spinner.setAdapter(adapter);
     
     SharedPreferences settings = getSharedPreferences(KEY_SCORE, 0);
     int silent = settings.getInt("bod", 0);
     body.setText(""+silent);
     
     
} 
    public void onAdd(View view){
    	SharedPreferences settings = getSharedPreferences(KEY_SCORE, 0);
        int silent = settings.getInt("bod", 0);
    	mCurrentScore = silent;
       mCurrentScore += 1;
       getBundleData();
      
       
       SharedPreferences.Editor editor = settings.edit();
       editor.putInt("bod", mCurrentScore);

       // Commit the edits!
       editor.commit();
       
       
       body.setText("" + mCurrentScore);
    }

}
