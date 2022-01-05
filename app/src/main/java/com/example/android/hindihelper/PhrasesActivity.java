package com.example.android.hindihelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("My name is ____", "Mera naam ___ hai."));
        phrases.add(new Word("What is your name?","tumhaara naam kya hai?"));
        phrases.add(new Word("How are you feeling?", "Tumhe kaisa lag raha hai?"));
        phrases.add(new Word("I’m feeling good.", "Main achchha mahasoos kar raha hoon."));
        phrases.add(new Word("Where are you going?", "Tum kahaan jaa rahe ho?"));
        phrases.add(new Word("Are you coming?", "Kya aap aa rahe hain?"));
        phrases.add(new Word("Yes, I’m coming.", "Haan, main aa raha hoon."));
        phrases.add(new Word("Let’s go.", "Chalo chalen."));
        phrases.add(new Word("Come here.", "Yahaan aao."));

        WordAdapter adapter = new WordAdapter(this, phrases);
        ListView listView = (ListView) findViewById(R.id.listPhrases);
        listView.setAdapter(adapter);
        
    }
    
}
