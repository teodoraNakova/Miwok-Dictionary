package com.example.android.miwokdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.id;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbersEnglish = new ArrayList<>();
        numbersEnglish.add(new Word("one", "lutti"));
        numbersEnglish.add(new Word("two", "otiiko"));
        numbersEnglish.add(new Word("three", "tolookosu"));
        numbersEnglish.add(new Word("four", "oyyisa"));
        numbersEnglish.add(new Word("five", "massokka"));
        numbersEnglish.add(new Word("six", "temmokka"));
        numbersEnglish.add(new Word("seven", "kenekaku"));
        numbersEnglish.add(new Word("eight", "kawinta"));
        numbersEnglish.add(new Word("nine", "wo'e"));
        numbersEnglish.add(new Word("ten", "na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, numbersEnglish);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
