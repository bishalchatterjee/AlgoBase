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
             problem9,problem10,problem11,problem12,problem13,problem14,problem15,problem16,problem17,problem18,problem19,problem20,
             problem21,problem22,problem23,problem24,problem25,problem26,problem27,problem28,problem29,problem30,
             problem31,problem32,problem33,problem34,problem35,problem36,problem37,problem38,problem39,problem40;



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
        problem21=view.findViewById(R.id.p_21);
        problem22=view.findViewById(R.id.p_22);
        problem23=view.findViewById(R.id.p_23);
        problem24=view.findViewById(R.id.p_24);
        problem25=view.findViewById(R.id.p_25);
        problem26=view.findViewById(R.id.p_26);
        problem27=view.findViewById(R.id.p_27);
        problem28=view.findViewById(R.id.p_28);
        problem29=view.findViewById(R.id.p_29);
        problem30=view.findViewById(R.id.p_30);
        problem31=view.findViewById(R.id.p_31);
        problem32=view.findViewById(R.id.p_32);
        problem33=view.findViewById(R.id.p_33);
        problem34=view.findViewById(R.id.p_34);
        problem35=view.findViewById(R.id.p_35);
        problem36=view.findViewById(R.id.p_36);
        problem37=view.findViewById(R.id.p_37);
        problem38=view.findViewById(R.id.p_38);
        problem39=view.findViewById(R.id.p_39);
        problem40=view.findViewById(R.id.p_40);












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

        problem21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question21.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }


        });


        problem22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question22.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question23.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question24.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question25.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question26.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question27.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question28.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question29.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question30.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });


        problem31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Using Bundle to send data to Solution fragment
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question31.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }


        });


        problem32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question32.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question33.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question34.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question35.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question36.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question37.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question38.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });

        problem39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question39.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });
        problem40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "https://github.com/bishalchatterjee/AlgoBase-ProblemCodes/blob/master/question40.java");
                SolutionFragment sl=new SolutionFragment();
                sl.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout1,sl).addToBackStack(null).commit();
            }

        });


        return view;
    }
}
