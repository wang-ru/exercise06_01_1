package com.example.exercise06_01_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Gson g=new Gson();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		MenuInflater mi=getMenuInflater();
		mi.inflate(R.menu.menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.play:
			Toast.makeText(this, "paly", 0).show();
			Intent intent=new Intent(MainActivity.this, SubActivity.class);
			startActivity(intent);
			break;
		case R.id.pause:
			Toast.makeText(this, "pause", 0).show();
			
			break;

		default:
			break;
		}
		return true;
	}
}
