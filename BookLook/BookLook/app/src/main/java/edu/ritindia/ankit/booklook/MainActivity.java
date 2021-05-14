package edu.ritindia.ankit.booklook;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Home");
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#4fc3f7"));
        actionBar.setBackgroundDrawable(colorDrawable);
//hii ankit


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menus,menu);
        return super.onCreateOptionsMenu(menu);
    }
}