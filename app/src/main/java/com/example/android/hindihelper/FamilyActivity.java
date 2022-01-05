package com.example.android.hindihelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Father", "Pita", R.drawable.family_father));
        family.add(new Word("Mother","Maata", R.drawable.family_mother));
        family.add(new Word("Son", "Beta", R.drawable.family_son));
        family.add(new Word("Daughter", "Beti", R.drawable.family_daughter));
        family.add(new Word("Older Brother", "Bada Bhai", R.drawable.family_older_brother));
        family.add(new Word("Younger Brother", "Chhota Bhai", R.drawable.family_younger_brother));
        family.add(new Word("Older Sister", "Badi Behan", R.drawable.family_older_sister));
        family.add(new Word("Younger Sister", "Chhoti Behan", R.drawable.family_younger_sister));
        family.add(new Word("Grandmother", "Dadi", R.drawable.family_grandmother));
        family.add(new Word("Grandmother", "Dada", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, family);
        ListView listView = (ListView) findViewById(R.id.listFamily);
        listView.setAdapter(adapter);
        
    }
}