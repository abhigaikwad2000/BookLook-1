package edu.ritindia.ankit.booklook;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class screen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread sc = new Thread();
        try {

            sc.sleep(5000);
            startActivity(new Intent(this,MainActivity.class));
            finish();
        }catch (Exception e){

        }
        sc.start();
    }
}
