package com.example.android.miwokdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<>();
        numbers.add(new Word(R.string.one, "lutti", R.drawable.number_one));
        numbers.add(new Word(R.string.two, "otiiko", R.drawable.number_two));
        numbers.add(new Word(R.string.three, "tolookosu", R.drawable.number_three));
        numbers.add(new Word(R.string.four, "oyyisa", R.drawable.number_four));
        numbers.add(new Word(R.string.five, "massokka", R.drawable.number_five));
        numbers.add(new Word(R.string.six, "temmokka", R.drawable.number_six));
        numbers.add(new Word(R.string.seven, "kenekaku", R.drawable.number_seven));
        numbers.add(new Word(R.string.eight, "kawinta", R.drawable.number_eight));
        numbers.add(new Word(R.string.nine, "wo'e", R.drawable.number_nine));
        numbers.add(new Word(R.string.ten, "na'aacha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
