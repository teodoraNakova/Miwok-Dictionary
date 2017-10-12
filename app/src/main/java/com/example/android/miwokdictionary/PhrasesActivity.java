package com.example.android.miwokdictionary;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwokdictionary.R.id.colors;
import static com.example.android.miwokdictionary.R.id.phrases;

public class PhrasesActivity extends AppCompatActivity {

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
        final ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word(R.string.where_are_you_going, "minto wuksus", R.raw.phrase_where_are_you_going));
        phrases.add(new Word(R.string.what_is_your_name, "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        phrases.add(new Word(R.string.my_name_is, "oyaaset...", R.raw.phrase_my_name_is));
        phrases.add(new Word(R.string.how_are_you_feeling, "michәksәs?", R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word(R.string.im_feeling_good, "kuchi achit", R.raw.phrase_im_feeling_good));
        phrases.add(new Word(R.string.are_you_coming, "әәnәs'aa?", R.raw.phrase_are_you_coming));
        phrases.add(new Word(R.string.yes_im_coming, "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        phrases.add(new Word(R.string.im_coming, "әәnәm", R.raw.phrase_im_coming));
        phrases.add(new Word(R.string.lets_go, "yoowutis", R.raw.phrase_lets_go));
        phrases.add(new Word(R.string.come_here, "әnni'nem", R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this, phrases, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = phrases.get(i);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
