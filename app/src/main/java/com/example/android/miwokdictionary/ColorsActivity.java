package com.example.android.miwokdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<>();
        colors.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        colors.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        colors.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        colors.add(new Word("green", "chokokki", R.drawable.color_green));
        colors.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        colors.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        colors.add(new Word("black", "kululli", R.drawable.color_black));
        colors.add(new Word("white", "kelelli", R.drawable.color_white));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView view = (ListView) findViewById(R.id.list);
        view.setAdapter(adapter);
    }
}
