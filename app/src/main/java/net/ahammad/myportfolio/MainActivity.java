package net.ahammad.myportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity{


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

    public void spotify(View view) {
        showToast("Spotify app");
    }

    public void scoreApp(View view) {
        showToast("Score app");
    }


    public void libraryApp(View view) {
        showToast("Library app");
    }

    public void biggerApp(View view) {
        showToast("Built it Bigger");
    }

    public void xyzApp(View view) {
        showToast("XYZ app");
    }

    private void showToast(String appName){
        Toast.makeText(this,"This Button will launch my "+appName,Toast.LENGTH_LONG).show();
    }



}
