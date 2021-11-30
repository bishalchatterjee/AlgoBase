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
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/Image%20assets%20for%20app/CN.png");
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
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/Image%20assets%20for%20app/CP.png");
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
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/Image%20assets%20for%20app/DBMS.png");
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
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/Image%20assets%20for%20app/ML.png");
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
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/Image%20assets%20for%20app/OOPS.png");
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
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/Image%20assets%20for%20app/OS.png");
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
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/Image%20assets%20for%20app/PLACEMENT.png");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });

        return view;
    }
}