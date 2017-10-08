package com.example.android.miwokdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word(R.string.where_are_you_going, "minto wuksus"));
        phrases.add(new Word(R.string.what_is_your_name, "tinnә oyaase'nә"));
        phrases.add(new Word(R.string.my_name_is, "oyaaset..."));
        phrases.add(new Word(R.string.how_are_you_feeling, "michәksәs?"));
        phrases.add(new Word(R.string.im_feeling_good, "kuchi achit"));
        phrases.add(new Word(R.string.are_you_coming, "әәnәs'aa?"));
        phrases.add(new Word(R.string.yes_im_coming, "hәә’ әәnәm"));
        phrases.add(new Word(R.string.im_coming, "әәnәm"));
        phrases.add(new Word(R.string.lets_go, "yoowutis"));
        phrases.add(new Word(R.string.come_here, "әnni'nem"));

        WordAdapter adapter = new WordAdapter(this, phrases, R.color.category_phrases);
        ListView view = (ListView) findViewById(R.id.list);
        view.setAdapter(adapter);
    }
}
