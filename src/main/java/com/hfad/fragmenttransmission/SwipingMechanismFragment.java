package com.hfad.fragmenttransmission;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SwipingMechanismFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private TextView textViewBlue;
    private TextView textViewGreen;
    private String mParam1;
    private String mParam2;

    public SwipingMechanismFragment() {
        // Required empty public constructor
    }

    public static SwipingMechanismFragment newInstance(String param1, String param2) {
        SwipingMechanismFragment fragment = new SwipingMechanismFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swiping_mechanism, container, false);
        textViewBlue = view.findViewById(R.id.swipe_blue_textView);
        textViewGreen = view.findViewById(R.id.swipe_green_textView);
        textViewGreen.setText(mParam1);
        textViewBlue.setText(mParam2);
        return view;
    }
}
