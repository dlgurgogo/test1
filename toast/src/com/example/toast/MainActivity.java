package com.example.toast;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
	public void Dialogbutton(View view){
		switch (view.getId()){
		case R.id.button3 :
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setTitle("dialog");
			bd.setMessage("¤¾¤·");
			bd.setCancelable(false);
			
			bd.setNegativeButton("¤²¤·", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dialog, int id) {
				
			}
		});
			
		bd.show();
	}
	}
		
	
	
	
	public void Toastbutton(View view) {
	Toast.makeText(this, "hohoho ¼î¹ß",Toast.LENGTH_SHORT).show();
	}
	
	public void Nextpage(View view) {
		Intent intent = new Intent(this,Newpage.class);
		startActivity(intent);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		Toast.makeText(this, "Àß°¡¶ó",Toast.LENGTH_SHORT).show();
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
