package com.example.android.hindihelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter2 extends ArrayAdapter<Word2> {

    public WordAdapter2(@NonNull Context context, ArrayList<Word2> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item2, parent, false);
        }

        Word2 currentWord = getItem(position);

        TextView numView = (TextView) listItemView.findViewById(R.id.imageView2);
        numView.setText(currentWord.getNumWord());

        TextView engTextView = (TextView) listItemView.findViewById(R.id.english_textView2);
        engTextView.setText(currentWord.getEnglishWord());

        TextView hinTextView = (TextView) listItemView.findViewById(R.id.hindi_textView2);
        hinTextView.setText(currentWord.getHindiWord());

        return listItemView;
    }

}
