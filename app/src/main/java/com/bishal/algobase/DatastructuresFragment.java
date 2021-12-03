package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class DatastructuresFragment extends Fragment {

    ImageView menu_iv;
    CardView ds_item_1,ds_item_2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_datastructures, container, false);
        menu_iv=view.findViewById(R.id.menu_iv);


        //ds items linking
        ds_item_1=view.findViewById(R.id.ds_item_1);
        ds_item_2=view.findViewById(R.id.ds_item_2);


        menu_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MenuActivity.class);
                startActivity(i);
            }
        });




        ds_item_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "1");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "2");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });



        return view;
    }
}