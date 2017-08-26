package com.example.saiteja.kiosktest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class frag extends Fragment {
    private int res;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStates) {

        View view = inflater.inflate(res,container,false);
        Toast.makeText(getActivity(),"This is the screen",Toast.LENGTH_SHORT).show();
        return view;


    }
    public void setres(int res){
        this.res = res;
    }
    public frag(){

    }

}
