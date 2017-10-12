package com.example.android.miwokdictionary;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwokdictionary.R.id.numbers;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> colors = new ArrayList<>();
        colors.add(new Word(R.string.red, "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colors.add(new Word(R.string.mustard_yellow, "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        colors.add(new Word(R.string.dusty_yellow, "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colors.add(new Word(R.string.green, "chokokki", R.drawable.color_green, R.raw.color_green));
        colors.add(new Word(R.string.brown, "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colors.add(new Word(R.string.grey, "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new Word(R.string.black, "kululli", R.drawable.color_black, R.raw.color_black));
        colors.add(new Word(R.string.white, "kelelli", R.drawable.color_white, R.raw.color_white));

        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = colors.get(i);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
