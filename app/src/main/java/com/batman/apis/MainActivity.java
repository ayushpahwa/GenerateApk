package com.batman.apis;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.jboss.shrinkwrap.android.api.spec.AndroidArchive;
import org.jboss.shrinkwrap.android.api.spec.AndroidManifest;
import org.jboss.shrinkwrap.api.ShrinkWrap;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button generate = (Button) findViewById(R.id.GenerateApk);
       generate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               AndroidArchive archive = ShrinkWrap.create(AndroidArchive.class);
               AndroidManifest manifest = new AndroidManifest();

               archive.addClass(HelloWorld.class);

           }
       });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
