package com.example.saiteja.kiosktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class aboutActivity extends AppCompatActivity {

   /* private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent i;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    i = new Intent(aboutActivity.this, MainActivity.class);
                    startActivity(i);
                    return true;
                case R.id.navigation_classes:
                    i =new Intent(aboutActivity.this, classActivity.class);
                    startActivity(i);
                    return true;
                case R.id.navigation_navigation:
                    i =new Intent(aboutActivity.this, navActivity.class);
                    startActivity(i);
                    return true;
                case R.id.navigation_faculty:
                    i =new Intent(aboutActivity.this, facultyActivity.class);
                    startActivity(i);
                    return true;
                case R.id.navigation_labs:
                    i =new Intent(aboutActivity.this, LabActivity.class);
                    startActivity(i);
                    return true;
                case R.id.navigation_about:
                    i =new Intent(aboutActivity.this, aboutActivity.class);
                    startActivity(i);
                    return true;

            }
            return false;
        }

    };
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
       // BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

}
