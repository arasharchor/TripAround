package de.triparound.triparound;

import android.app.Activity;
/*
 * author: on 11/08/2015.
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.maketripbutton);

	    button.setOnClickListener(new OnClickListener()
	    {
	      public void onClick(View v)
	      {
/*	    	  Toast.makeText(getApplicationContext(), "Button is clicked!", 
	    			   Toast.LENGTH_LONG).show();*/
	    	  Intent toListIntent = new Intent(MainActivity.this,
	    			  MakeTripActivity.class);
				startActivity(toListIntent);
	      }
	    });
	    
		Button button2 = (Button) findViewById(R.id.savetripbutton);

	    button2.setOnClickListener(new OnClickListener()
	    {
	      public void onClick(View v)
	      {
/*	    	  Toast.makeText(getApplicationContext(), "Button is clicked!", 
	    			   Toast.LENGTH_LONG).show();*/
	    	  Intent toListIntent = new Intent(MainActivity.this,
	    			  SaveTripActivity.class);
				startActivity(toListIntent);
	      }
	    });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
