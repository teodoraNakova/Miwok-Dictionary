package com.example.android.miwokdictionary;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView defaultTranslationTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslationTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;
    }
}
