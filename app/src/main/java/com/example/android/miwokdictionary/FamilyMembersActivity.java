package com.example.android.miwokdictionary;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

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
        final ArrayList<Word> familyMembers = new ArrayList<>();
        familyMembers.add(new Word(R.string.father, "әpә", R.drawable.family_father, R.raw.family_father));
        familyMembers.add(new Word(R.string.mother, "әṭa", R.drawable.family_mother, R.raw.family_mother));
        familyMembers.add(new Word(R.string.son, "angsi", R.drawable.family_son, R.raw.family_son));
        familyMembers.add(new Word(R.string.daughter, "tune", R.drawable.family_daughter, R.raw.family_daughter));
        familyMembers.add(new Word(R.string.older_brother, "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyMembers.add(new Word(R.string.younger_sister, "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyMembers.add(new Word(R.string.older_sister, "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyMembers.add(new Word(R.string.younger_sister, "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyMembers.add(new Word(R.string.grandmother, "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyMembers.add(new Word(R.string.grandfather, "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, familyMembers, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = familyMembers.get(i);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(FamilyMembersActivity.this, word.getmAudioResourceId());
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
