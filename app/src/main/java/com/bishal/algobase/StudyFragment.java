package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


public class StudyFragment extends Fragment {
    ImageView menu_iv,androiddev_iv,angular_iv,backend_iv,cn_iv,cp_iv,dbms_iv,devops_iv,frontend_iv,java_iv,ml_iv,oops_iv,os_iv,python_iv,react_iv,placements_iv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_study, container, false);

        menu_iv=view.findViewById(R.id.menu_iv);

        androiddev_iv=view.findViewById(R.id.androiddev_iv);
        angular_iv=view.findViewById(R.id.angular_iv);
        backend_iv=view.findViewById(R.id.backend_iv);
        cn_iv=view.findViewById(R.id.cn_iv);
        cp_iv=view.findViewById(R.id.cp_iv);
        dbms_iv=view.findViewById(R.id.dbms_iv);
        devops_iv=view.findViewById(R.id.devops_iv);
        frontend_iv=view.findViewById(R.id.frontend_iv);
        java_iv=view.findViewById(R.id.java_iv);
        ml_iv=view.findViewById(R.id.ml_iv);
        oops_iv=view.findViewById(R.id.oops_iv);
        os_iv=view.findViewById(R.id.os_iv);
        python_iv=view.findViewById(R.id.python_iv);
        react_iv=view.findViewById(R.id.react_iv);
        placements_iv=view.findViewById(R.id.placements_iv);




        menu_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MenuActivity.class);
                startActivity(i);
            }
        });



        androiddev_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/android");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        angular_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/angular");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        backend_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/backend");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        cn_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://whimsical.com/networking-cheatsheet-by-love-babbar-FcLExFDezehhfsbDPfZDBv                                                                 ");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        cp_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://whimsical.com/codeforces-candidate-master-roadmap-by-love-babbar-CiXPPD3CnwoXPr2d8Ajx1h");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        dbms_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://whimsical.com/dbms-roadmap-by-love-babbar-FmUi8ffVop33t3MmpVxPCo  ");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        devops_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/devops");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        frontend_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/frontend");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        java_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        ml_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://whimsical.com/machine-learning-roadmap-2020-CA7f3ykvXpnJ9Az32vYXva");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        oops_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://whimsical.com/object-oriented-programming-cheatsheet-by-love-babbar-YbSgLatbWQ4R5paV7EgqFw");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        os_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://whimsical.com/operating-system-cheatsheet-by-love-babbar-S9tuWBCSQfzoBRF5EDNinQ");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        python_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/python");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        react_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://roadmap.sh/react");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        placements_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://whimsical.com/4th-year-roadmap-to-dream-placement-WB2HTZixtsohXoDcvr6Me7");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });

        return view;
    }
}