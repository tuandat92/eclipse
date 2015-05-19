package com.example.tuandat;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent intent = new Intent("com.google.zxing.client.android.SCAN");
		startActivityForResult(intent, 0);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode,resultCode,data);
		if(resultCode == Activity.RESULT_OK){
			if(data!=null){
				String dinhdang = data.getStringExtra("RESULT_FORMAT");
				String ketqua = data.getStringExtra("SCAN_RESULT");
				
				Log.d("Ket qua", dinhdang + " - "+ketqua);
			}
		}
		
	}
}
