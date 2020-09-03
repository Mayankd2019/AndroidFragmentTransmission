package com.hfad.fragmenttransmission;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import androidx.fragment.app.Fragment;

public class FragmentGreen extends Fragment {

    public FragmentGreen.FragmentGreenListener fragmentGreenListener;
    public EditText editText;
    private Button button;

    public View onCreateView(LayoutInflater inflater, ViewGroup Container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_green,Container,false);
        editText = (EditText) view.findViewById(R.id.textView_green);
        button = (Button) view.findViewById(R.id.button_green);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentGreenListener = (FragmentGreenListener)getActivity();
                fragmentGreenListener.getGreenText(editText.getText().toString());
            }
        });
        return view;
    }

    public void updateEditText(String Text){
        editText.setText(Text);
    }

    public interface FragmentGreenListener{
        void getGreenText(String text);

    }
}













