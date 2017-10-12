package com.example.android.miwokdictionary;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> numbers = new ArrayList<>();
        numbers.add(new Word(R.string.one, "lutti", R.drawable.number_one, R.raw.number_one));
        numbers.add(new Word(R.string.two, "otiiko", R.drawable.number_two, R.raw.number_two));
        numbers.add(new Word(R.string.three, "tolookosu", R.drawable.number_three, R.raw.number_three));
        numbers.add(new Word(R.string.four, "oyyisa", R.drawable.number_four, R.raw.number_four));
        numbers.add(new Word(R.string.five, "massokka", R.drawable.number_five, R.raw.number_five));
        numbers.add(new Word(R.string.six, "temmokka", R.drawable.number_six, R.raw.number_six));
        numbers.add(new Word(R.string.seven, "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numbers.add(new Word(R.string.eight, "kawinta", R.drawable.number_eight, R.raw.number_eight));
        numbers.add(new Word(R.string.nine, "wo'e", R.drawable.number_nine, R.raw.number_nine));
        numbers.add(new Word(R.string.ten, "na'aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(this, numbers, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = numbers.get(i);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
