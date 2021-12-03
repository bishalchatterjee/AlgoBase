package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


public class StudyFragment extends Fragment {
    ImageView menu_iv,androiddev_iv,angular_iv,backend_iv,cn_iv,cp_iv,dbms_iv,devops_iv,frontend_iv,java_iv,ml_iv,oops_iv,os_iv,python_iv,react_iv,placements_iv,
    book1_iv,book2_iv,book3_iv,book4_iv,book5_iv,book6_iv,book7_iv,book8_iv,book9_iv,book10_iv,book11_iv,book12_iv,book13_iv,book14_iv,book15_iv,book16_iv,book17_iv,
    site1_iv,site2_iv,site3_iv,site4_iv,site5_iv,site6_iv,site7_iv,site8_iv,site9_iv,site10_iv,
    compiler1_iv,compiler2_iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_study, container, false);

        menu_iv=view.findViewById(R.id.menu_iv);


        //Roadmaps
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


        //eBooks
        book1_iv=view.findViewById(R.id.book1_iv);
        book2_iv=view.findViewById(R.id.book2_iv);
        book3_iv=view.findViewById(R.id.book3_iv);
        book4_iv=view.findViewById(R.id.book4_iv);
        book5_iv=view.findViewById(R.id.book5_iv);
        book6_iv=view.findViewById(R.id.book6_iv);
        book7_iv=view.findViewById(R.id.book7_iv);
        book8_iv=view.findViewById(R.id.book8_iv);
        book9_iv=view.findViewById(R.id.book9_iv);
        book10_iv=view.findViewById(R.id.book10_iv);
        book11_iv=view.findViewById(R.id.book11_iv);
        book12_iv=view.findViewById(R.id.book12_iv);
        book13_iv=view.findViewById(R.id.book13_iv);
        book14_iv=view.findViewById(R.id.book14_iv);
        book15_iv=view.findViewById(R.id.book15_iv);
        book16_iv=view.findViewById(R.id.book16_iv);
        book17_iv=view.findViewById(R.id.book17_iv);




        //websites
        site1_iv=view.findViewById(R.id.site1_iv);
        site2_iv=view.findViewById(R.id.site2_iv);
        site3_iv=view.findViewById(R.id.site3_iv);
        site4_iv=view.findViewById(R.id.site4_iv);
        site5_iv=view.findViewById(R.id.site5_iv);
        site6_iv=view.findViewById(R.id.site6_iv);
        site7_iv=view.findViewById(R.id.site7_iv);
        site8_iv=view.findViewById(R.id.site8_iv);
        site9_iv=view.findViewById(R.id.site9_iv);
        site10_iv=view.findViewById(R.id.site10_iv);



        //online compilers
        compiler1_iv=view.findViewById(R.id.compiler1_iv);
        compiler2_iv=view.findViewById(R.id.compiler2_iv);



        




        menu_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MenuActivity.class);
                startActivity(i);
            }
        });


        //start of Road-Map on click listeners

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


        //end of Road-map on click listeners


        //start of Books on click listeners

        book1_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://drive.google.com/file/d/1MaME8sW57H6eLlZvQ4Gqn5y7aVhuxlj5/view?usp=sharing");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        book2_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://drive.google.com/file/d/1WhPibQc2iAHu_N2se0ePGoMI0kJNJQxc/view?usp=sharing");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        book3_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://drive.google.com/file/d/1daX6bPR_f1wkvNQ2jKFc7Rwr_Q54rp1M/view?usp=sharing");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });

        //end of Books on click listeners

        //start of websites on click listeners
        site1_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://www.geeksforgeeks.org/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site2_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://www.hackerrank.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site3_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://www.codechef.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site4_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://codeforces.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site5_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://www.spoj.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site6_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://www.freecodecamp.org/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site7_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://icpc.global/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site8_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://leetcode.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site9_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://www.w3schools.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        site10_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://www.interviewbit.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });



        //end of websites on click listeners



        //start of Online Compilers on click listeners
        compiler1_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://ide.geeksforgeeks.org/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });
        compiler2_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://ideone.com/");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout2,sl).addToBackStack(null).commit();
            }


        });

        //end of Online Compilers on click listeners




        return view; //finally returning the view
    }
}