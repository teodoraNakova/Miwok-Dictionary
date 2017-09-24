package com.example.android.miwokdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbersEnglish = new ArrayList<>();
        numbersEnglish.add(0, "one");
        numbersEnglish.add(1, "two");
        numbersEnglish.add(2, "three");
        numbersEnglish.add(3, "four");
        numbersEnglish.add(4, "five");
        numbersEnglish.add(5, "six");
        numbersEnglish.add(6, "seven");
        numbersEnglish.add(7, "eight");
        numbersEnglish.add(8, "nine");
        numbersEnglish.add(9, "ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for(int i = 0; i < numbersEnglish.size(); i++) {
            TextView numbersView = new TextView(this);
            numbersView.setText(numbersEnglish.get(i));
            rootView.addView(numbersView);
        }
    }
}
