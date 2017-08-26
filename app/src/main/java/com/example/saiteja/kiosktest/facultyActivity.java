package com.example.saiteja.kiosktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class facultyActivity extends AppCompatActivity {
/*
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

*/

   private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent i;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    i = new Intent(facultyActivity.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_classes:
                    i =new Intent(facultyActivity.this, classActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_navigation:
                    i =new Intent(facultyActivity.this, navActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_faculty:
                    i =new Intent(facultyActivity.this, facultyActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_labs:
                    i =new Intent(facultyActivity.this, LabActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    return true;
               /* case R.id.navigation_about:
                    i =new Intent(facultyActivity.this, aboutActivity.class);
                    startActivity(i);
                    return true;
*/
            }
            return false;
        }

    };
    BottomNavigationView navigation;
    Menu menu;
    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        menu = navigation.getMenu();
        menuItem = menu.getItem(1);
        menuItem.setChecked(true);
    }
    @Override
    protected void onResume() {
        super.onResume();
        menuItem = menu.getItem(1);
        menuItem.setChecked(true);

    }
}
