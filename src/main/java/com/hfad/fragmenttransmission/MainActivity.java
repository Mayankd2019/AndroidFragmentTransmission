package com.hfad.fragmenttransmission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements FragmentBlue.FragmentBlueListener, FragmentGreen.FragmentGreenListener {


    private FragmentGreen fragmentGreen;
    private FragmentBlue fragmentBlue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            fragmentGreen = new FragmentGreen();
             fragmentBlue = new FragmentBlue();

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.fragment_blue, fragmentBlue);
            fragmentTransaction.add(R.id.fragment_green, fragmentGreen);
            fragmentTransaction.commit();
        }

        ((Button)findViewById(R.id.swipe_fragment_open_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSwipeFragmentButtonClicked();
            }
        });
    }

    private void onSwipeFragmentButtonClicked() {
        SwipingMechanismFragment swipingMechanismFragment = SwipingMechanismFragment.newInstance(fragmentGreen.editText.getText().toString(),
                fragmentBlue.editText.getText().toString());
    }


    @Override
    public void getBlueText(String text) {
        fragmentGreen.updateEditText(text);
    }

    @Override
    public void getGreenText(String text) {
        fragmentBlue.updateEditText(text);
    }

}
