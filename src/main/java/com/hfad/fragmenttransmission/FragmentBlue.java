package com.hfad.fragmenttransmission;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentBlue extends Fragment {

    public FragmentBlueListener fragmentBlueListener;
    public EditText editText;
    private Button button;

    public View onCreateView(LayoutInflater inflater, ViewGroup Container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_blue,Container,false);
        editText = (EditText) view.findViewById(R.id.textView_blue);
        button = (Button) view.findViewById(R.id.button_blue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentBlueListener = (FragmentBlueListener) getActivity();
                fragmentBlueListener.getBlueText(editText.getText().toString());
            }
        });
        return view;
    }

    public void updateEditText(String text) {
        editText.setText(text);
    }

    public interface FragmentBlueListener{
        void getBlueText(String text);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof FragmentBlueListener) {
            fragmentBlueListener = (FragmentBlueListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
