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
        colors.add(new Word("red", "weṭeṭṭi"));
        colors.add(new Word("mustard yellow", "chiwiiṭә"));
        colors.add(new Word("dusty yellow", "ṭopiisә"));
        colors.add(new Word("green", "chokokki"));
        colors.add(new Word("brown", "ṭakaakki"));
        colors.add(new Word("gray", "ṭopoppi"));
        colors.add(new Word("black", "kululli"));
        colors.add(new Word("white", "kelelli"));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView view = (ListView) findViewById(R.id.list);
        view.setAdapter(adapter);
    }
}
