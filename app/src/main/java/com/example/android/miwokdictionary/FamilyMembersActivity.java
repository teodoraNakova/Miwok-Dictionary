package com.example.android.miwokdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> familyMembers = new ArrayList<>();
        familyMembers.add(new Word(R.string.father, "әpә", R.drawable.family_father));
        familyMembers.add(new Word(R.string.mother, "әṭa", R.drawable.family_mother));
        familyMembers.add(new Word(R.string.son, "angsi", R.drawable.family_son));
        familyMembers.add(new Word(R.string.daughter, "tune", R.drawable.family_daughter));
        familyMembers.add(new Word(R.string.older_brother, "taachi", R.drawable.family_older_brother));
        familyMembers.add(new Word(R.string.younger_sister, "chalitti", R.drawable.family_younger_brother));
        familyMembers.add(new Word(R.string.older_sister, "teṭe", R.drawable.family_older_sister));
        familyMembers.add(new Word(R.string.younger_sister, "kolliti", R.drawable.family_younger_sister));
        familyMembers.add(new Word(R.string.grandmother, "ama", R.drawable.family_grandmother));
        familyMembers.add(new Word(R.string.grandfather, "paapa", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, familyMembers);
        ListView view = (ListView) findViewById(R.id.list);
        view.setAdapter(adapter);
    }
}
