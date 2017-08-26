package com.example.saiteja.kiosktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent i;
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                      i = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        return true;


                    case R.id.navigation_classes:
                         i =new Intent(MainActivity.this, classActivity.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.navigation_navigation:
                        i =new Intent(MainActivity.this, navActivity.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);

                        return true;
                    case R.id.navigation_faculty:
                        i =new Intent(MainActivity.this, facultyActivity.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.navigation_labs:
                        i =new Intent(MainActivity.this, LabActivity.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        return true;
                   /* case R.id.navigation_about:
                        i =new Intent(MainActivity.this, aboutActivity.class);
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
        setContentView(R.layout.activity_main);

        //
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        menu = navigation.getMenu();
        menuItem = menu.getItem(0);
        menuItem.setChecked(true);



       // BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        final Button button_faculty = (Button) findViewById(R.id.button_faculty);
        button_faculty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(MainActivity.this, facultyActivity.class);
                startActivity(i);
            }
        });

        //labs Button
        final Button button_labs = (Button) findViewById(R.id.button_labs);
        button_labs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(MainActivity.this, LabActivity.class);
                startActivity(i);
            }
        });

        //classes button

        final Button button_class = (Button) findViewById(R.id.button_classes);
        button_class.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(MainActivity.this, classActivity.class);
                startActivity(i);
            }
        });






    }

    @Override
    protected void onResume() {
        super.onResume();
        menuItem = menu.getItem(0);
        menuItem.setChecked(true);

    }





}

