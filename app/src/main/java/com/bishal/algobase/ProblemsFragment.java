package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class ProblemsFragment extends Fragment {

    ImageView menu_iv;
    CardView problem1,problem2,problem3,problem4,problem5,problem6,problem7,problem8,
            problem9,problem10,problem11,problem12,problem13,problem14,problem15,problem16,problem17,problem18,problem19,problem20;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_problems, container, false);


        menu_iv=view.findViewById(R.id.menu_iv);


        problem1=view.findViewById(R.id.p_1);
        problem2=view.findViewById(R.id.p_2);
        problem3=view.findViewById(R.id.p_3);
        problem4=view.findViewById(R.id.p_4);
        problem5=view.findViewById(R.id.p_5);
        problem6=view.findViewById(R.id.p_6);
        problem7=view.findViewById(R.id.p_7);
        problem8=view.findViewById(R.id.p_8);
        problem9=view.findViewById(R.id.p_9);
        problem10=view.findViewById(R.id.p_10);
        problem11=view.findViewById(R.id.p_11);
        problem12=view.findViewById(R.id.p_12);
        problem13=view.findViewById(R.id.p_13);
        problem14=view.findViewById(R.id.p_14);
        problem15=view.findViewById(R.id.p_15);
        problem16=view.findViewById(R.id.p_16);
        problem17=view.findViewById(R.id.p_17);
        problem18=view.findViewById(R.id.p_18);
        problem19=view.findViewById(R.id.p_19);
        problem20=view.findViewById(R.id.p_20);











        menu_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MenuActivity.class);
                startActivity(i);
            }
        });

        problem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question1.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }


        });


        problem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question2.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question3.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question4.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question5.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question6.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question7.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question8.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question9.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question10.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });


        problem11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question11.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }


        });


        problem12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question12.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question13.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question14.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question15.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question16.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question17.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question18.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question19.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question20.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });


        return view;
    }
}
