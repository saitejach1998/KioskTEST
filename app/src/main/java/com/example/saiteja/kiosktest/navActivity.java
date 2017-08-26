package com.example.saiteja.kiosktest;

import android.content.ComponentName;
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
                    i.putExtra("activity","navActivity");
                    startActivity(i);


                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_classes:
                    i =new Intent(navActivity.this, classActivity.class);
                    i.putExtra("activity","navActivity");
                    startActivity(i);

                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_navigation:
                    i =new Intent(navActivity.this, navActivity.class);
                    //i.putExtra("activity","navActivity");
                    startActivity(i);

                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_faculty:
                    i =new Intent(navActivity.this, facultyActivity.class);
                    i.putExtra("activity","navActivity");
                    startActivity(i);
                    //i.putExtra("activity","navActivity");
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_labs:
                    i =new Intent(navActivity.this, LabActivity.class);
                    i.putExtra("activity","navActivity");
                    startActivity(i);
                    //i.putExtra("activity","navActivity");
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

    BottomNavigationView navigation;
    Menu menu;
    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        menu = navigation.getMenu();
        menuItem = menu.getItem(4);
        menuItem.setChecked(true);
    }
    @Override
    protected void onResume() {
        super.onResume();
        menuItem = menu.getItem(4);
        menuItem.setChecked(true);

    }
}
