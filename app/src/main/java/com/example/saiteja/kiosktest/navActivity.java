package com.example.saiteja.kiosktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class navActivity extends AppCompatActivity {

   private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent i;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    i = new Intent(navActivity.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_classes:
                    i =new Intent(navActivity.this, classActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_navigation:
                    i =new Intent(navActivity.this, navActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_faculty:
                    i =new Intent(navActivity.this, facultyActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_labs:
                    i =new Intent(navActivity.this, LabActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
              /*  case R.id.navigation_about:
                    i =new Intent(navActivity.this, aboutActivity.class);
                    startActivity(i);
                    return true;

            */}
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
    }

}
