package com.bishal.algobase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class InformationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_information, container, false);
        String value = getArguments().getString("YourKey");


        if(value.equals("1"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("2"))
           return inflater.inflate(R.layout.ds_linkedlist, container, false);
       else if (value.equals("3"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("4"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("5"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("6"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("7"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("8"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("9"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else if (value.equals("10"))
           return inflater.inflate(R.layout.ds_arrays, container, false);
       else
           return  view;
    }
}