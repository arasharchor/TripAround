package de.triparound.triparound;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MakeTripActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_make_trip);
		Button button = (Button) findViewById(R.id.search_button);
		// button.setBackgroundColor
		// (getResources().getColor(R.color.holo_orange_light));

		EditText editText = (EditText) findViewById(R.id.city_name);
		editText.setText(getString(R.string.enter_city),
				TextView.BufferType.EDITABLE);
		editText.setOnClickListener(this);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, COUNTRIES);
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.city_name);
		textView.setAdapter(adapter);

		// this.setTitle("Berlin");
		this.getActionBar()
				.setTitle(
						Html.fromHtml("<font color='#FFFFFF' Bold=\"true\" size = \"20\">"
								+ getString(R.string.app_name) + "</font>"));

	}

	private static final String[] COUNTRIES = new String[] { "Berlin",
			"Frankfurt", "Brussels", "Bombay", "Munich" };

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.make_trip, menu);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.city_name:
			EditText editText = (EditText) findViewById(R.id.city_name);
			if (editText.getText().toString()
					.equals(getString(R.string.enter_city))) {
				editText.setText("");
			}
			break;
		case R.id.class1:
			TextView textView = (TextView) findViewById(R.id.class1);
			ColorDrawable cd = (ColorDrawable) textView.getBackground();
			int colorCode = cd.getColor();
			if (colorCode == getResources().getColor(R.color.holo_orange_light)) {
				textView.setBackgroundColor(getResources().getColor(
						R.color.OrangeRed));
			} else {
				textView.setBackgroundColor(getResources().getColor(
						R.color.holo_orange_light));
			}
			break;
		case R.id.class2:
			textView = (TextView) findViewById(R.id.class2);
			cd = (ColorDrawable) textView.getBackground();
			colorCode = cd.getColor();
			if (colorCode == getResources().getColor(R.color.holo_orange_light)) {
				textView.setBackgroundColor(getResources().getColor(
						R.color.OrangeRed));
			} else {
				textView.setBackgroundColor(getResources().getColor(
						R.color.holo_orange_light));
			}
			break;
		case R.id.class3:
			textView = (TextView) findViewById(R.id.class3);
			cd = (ColorDrawable) textView.getBackground();
			colorCode = cd.getColor();
			if (colorCode == getResources().getColor(R.color.holo_orange_light)) {
				textView.setBackgroundColor(getResources().getColor(
						R.color.OrangeRed));
			} else {
				textView.setBackgroundColor(getResources().getColor(
						R.color.holo_orange_light));
			}
			break;
		case R.id.class4:
			textView = (TextView) findViewById(R.id.class4);
			cd = (ColorDrawable) textView.getBackground();
			colorCode = cd.getColor();
			if (colorCode == getResources().getColor(R.color.holo_orange_light)) {
				textView.setBackgroundColor(getResources().getColor(
						R.color.OrangeRed));
			} else {
				textView.setBackgroundColor(getResources().getColor(
						R.color.holo_orange_light));
			}
			break;
		case R.id.class5:
			textView = (TextView) findViewById(R.id.class5);
			cd = (ColorDrawable) textView.getBackground();
			colorCode = cd.getColor();
			if (colorCode == getResources().getColor(R.color.holo_orange_light)) {
				textView.setBackgroundColor(getResources().getColor(
						R.color.OrangeRed));
			} else {
				textView.setBackgroundColor(getResources().getColor(
						R.color.holo_orange_light));
			}
			break;
		case R.id.class6:
			textView = (TextView) findViewById(R.id.class6);
			cd = (ColorDrawable) textView.getBackground();
			colorCode = cd.getColor();
			if (colorCode == getResources().getColor(R.color.holo_orange_light)) {
				textView.setBackgroundColor(getResources().getColor(
						R.color.OrangeRed));
			} else {
				textView.setBackgroundColor(getResources().getColor(
						R.color.holo_orange_light));
			}
			break;
		case R.id.search_button:
/*			Toast.makeText(getApplicationContext(), "Button is clicked!", 
	    			   Toast.LENGTH_LONG).show();*/
			Intent toListIntent = new Intent(MakeTripActivity.this,
					TripResultsActivity.class);
			startActivity(toListIntent);
			break;
		}
	}
}
