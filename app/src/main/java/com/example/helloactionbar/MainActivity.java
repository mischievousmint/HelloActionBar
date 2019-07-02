package com.example.helloactionbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        Fragment myFragment = new SearchFragment();
        FT.add(R.id.fragmenContainer, myFragment);
        FT.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        switch (item.getItemId()) {
            case R.id.action_new:
                Log.i("ActionBar", "New");
                Toasty.info(getApplicationContext(), "Hello I`m new", Toast.LENGTH_SHORT, true).show();
                //toasty instructions: https://android-arsenal.com/details/1/5102
                Fragment myNewFragment = new NewFragment();
                FT.replace(R.id.fragmenContainer, myNewFragment);
                FT.commit();
                return true;
            case R.id.action_search:
                Log.i("ActionBar", "Search");
                Toasty.success(getApplicationContext(), "Hi I`m searching", Toast.LENGTH_SHORT, true).show();
                myNewFragment = new SearchFragment();
                FT.replace(R.id.fragmenContainer, myNewFragment);
                FT.commit();
                return true;
            case R.id.action_settings:
                Log.i("ActionBar", "Settings");
                Toasty.warning(getApplicationContext(), "Hey I`m settings.", Toast.LENGTH_SHORT, true).show();
                myNewFragment = new SettingsFragment();
                FT.replace(R.id.fragmenContainer, myNewFragment);
                FT.commit();
                return true;
            case R.id.action_colors:
                Log.i("ActionBar", "Colors");
                Toasty.warning(getApplicationContext(), "Hey I`m colors.", Toast.LENGTH_SHORT, true).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
