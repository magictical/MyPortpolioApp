package com.example.android.myportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button spotifyButton;
    private Button scoresButton;
    private Button library;
    private Button buildItBigger;
    private Button xyzReader;
    private Button capStone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //added OnClickListener and Toast
        //to see the comparison between onClick and OnClickListener, leave a OnClickListener's code

        capStone = (Button) findViewById(R.id.capStone);
        capStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.capStone,Toast.LENGTH_SHORT).show();
            }
        });

    }

    //added OnClick method instead of OnClickListener see the difference
    // http://stackoverflow.com/questions/21319996/android-onclick-in-xml-vs-onclicklistener
    //요약 : 간단한곳은 onClick 다양한 옵션이 필요한 리스너의 경우 OnClickListener
    public void clickOnSpotify(View v) {
        Toast.makeText(MainActivity.this, R.string.spotify, Toast.LENGTH_SHORT).show();
    }

    public void clickOnScores(View v) {
        Toast.makeText(MainActivity.this,R.string.scores,Toast.LENGTH_SHORT).show();
    }

    public void clickOnLibrary(View v) {
        Toast.makeText(MainActivity.this,R.string.library,Toast.LENGTH_SHORT).show();
    }

    public void clickOnBuildIt(View v) {
        Toast.makeText(MainActivity.this, R.string.builditbigger,Toast.LENGTH_SHORT).show();
    }

    public void clickOnXyzReader(View v) {
        Toast.makeText(MainActivity.this, R.string.xyzReader, Toast.LENGTH_SHORT).show();
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
