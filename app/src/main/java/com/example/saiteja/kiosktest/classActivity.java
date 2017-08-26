package com.example.saiteja.kiosktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class classActivity extends AppCompatActivity {

    private fragmentstateadapter mSectionsStatePagerAdapter;
    private ViewPager mViewPager;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent i;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    i = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(i);

                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_classes:
                    i =new Intent(getBaseContext(), classActivity.class);
                    startActivity(i);

                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_navigation:
                    i =new Intent(getBaseContext(), navActivity.class);
                    startActivity(i);

                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_faculty:
                    i =new Intent(getBaseContext(), facultyActivity.class);
                    startActivity(i);

                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_labs:
                    i =new Intent(getBaseContext(), LabActivity.class);
                    startActivity(i);

                    overridePendingTransition(0, 0);
                    return true;
              /*  case R.id.navigation_about:
                    i =new Intent(classActivity.this, aboutActivity.class);
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



        setContentView(R.layout.activity_class);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        menu = navigation.getMenu();
        menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        mSectionsStatePagerAdapter = new fragmentstateadapter(getSupportFragmentManager());
        mViewPager  = (ViewPager)findViewById(R.id.container_frag);


        final RadioButton name = (RadioButton) findViewById(R.id.radioButton);
        final  RadioButton details = (RadioButton) findViewById(R.id.radioButton2);
        final RadioGroup class_group = (RadioGroup) findViewById(R.id.radioGroup);


        class_group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId==R.id.radioButton)
                {
                    details.setChecked(false);
                    Toast.makeText( getApplicationContext(),"select class by name", Toast.LENGTH_SHORT).show();
                   setupViewPager(mViewPager);
                    mViewPager.setCurrentItem(0);
                }

                if(checkedId == R.id.radioButton2)
                {
                    name.setChecked(false);
                    Toast.makeText( getApplicationContext(),"select class by detailsss", Toast.LENGTH_SHORT).show();
                }



            }
        });



    }


    private  void setupViewPager(ViewPager viewpager){

        fragmentstateadapter mfragmentstateadapter = new fragmentstateadapter(getSupportFragmentManager());
        mfragmentstateadapter.addfrags(new frag());
        mfragmentstateadapter.addfrags(new frag());
        mfragmentstateadapter.addfrags(new frag());
        viewpager.setAdapter(mfragmentstateadapter);
    }
    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }


    @Override
    protected void onResume() {
        super.onResume();
        menuItem = menu.getItem(3);
        menuItem.setChecked(true);

    }

}
