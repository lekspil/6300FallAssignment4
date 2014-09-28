package edu.gatech.seclass.unitconvertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class CurrencyActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_currency);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.currency, menu);
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
	public String dollarToEuros(double dollar) {
		double euros = dollar / 1.27;
		return String.valueOf(euros);
	}
    public String eurosToDollars(double euros) {
	 double dollars = euros * 1.27;	
	 return String.valueOf(dollars);
	}
	public void handleClick(View view) {
		boolean checked = ((RadioButton)view).isChecked();
		EditText txt = (EditText) findViewById(R.id.text2);
		double cost = Double.parseDouble(txt.getText().toString());
		switch (view.getId()) {
		case R.id.radio0:
		  if(checked){
			txt.setText(eurosToDollars(cost));
		  }
		  break;
		case R.id.radio1:
		  if(checked){
			 txt.setText(dollarToEuros(cost));
		  }
		  break;
       }
	}
}
