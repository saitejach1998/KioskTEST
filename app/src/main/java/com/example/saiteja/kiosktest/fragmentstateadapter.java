package com.example.saiteja.kiosktest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Saiteja on 30-07-2017.
 */

public  class fragmentstateadapter extends FragmentStatePagerAdapter {

    private final List<Fragment> FragList = new ArrayList<>();

    public fragmentstateadapter(FragmentManager fm) {
        super(fm);
    }
    public void addfrags(Fragment Fragment){

        FragList.add(Fragment);

    }
    @Override
    public Fragment getItem(int position) {
        return FragList.get(position);
    }

    @Override
    public int getCount() {
        return FragList.size();
    }

   /* @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        return ArrayListFragment.newInstance(position);
    }

*/

}
