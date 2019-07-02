package com.example.helloactionbar;

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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_new:
                Log.i("ActionBar", "New");
                Toasty.info(getApplicationContext(), "Hello I`m new", Toast.LENGTH_SHORT, true).show();
                return true;
            case R.id.action_search:
                Log.i("ActionBar", "Search");
                Toasty.success(getApplicationContext(), "Hi I`m searching", Toast.LENGTH_SHORT, true).show();
                return true;
            case R.id.action_settings:
                Log.i("ActionBar", "Settings");
                Toasty.warning(getApplicationContext(), "Hey I`m settings.", Toast.LENGTH_SHORT, true).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
