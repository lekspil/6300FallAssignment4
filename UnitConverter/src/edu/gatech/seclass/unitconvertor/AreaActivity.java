package edu.gatech.seclass.unitconvertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class AreaActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_area);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.area, menu);
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
	public String metersToFeet(double meters) {
		double feet = meters * 10.764;
		return String.valueOf(feet);
	}
    public String feetToMeters(double feet) {
	 double meters = feet/10.764;	
	 return String.valueOf(meters);
	}
	public void handleClick(View view) {
		boolean checked = ((RadioButton)view).isChecked();
		EditText txt = (EditText) findViewById(R.id.text1);
		double area = Double.parseDouble(txt.getText().toString());
		switch (view.getId()) {
		case R.id.radio0:
		  if(checked){
			txt.setText(metersToFeet(area));
		  }
		  break;
		case R.id.radio1:
		  if(checked){
			 txt.setText(feetToMeters(area));
		  }
		  break;
       }
	}
}
