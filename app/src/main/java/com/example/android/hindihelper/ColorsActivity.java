package com.example.android.hindihelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Red", "Laal", R.drawable.red));
        colors.add(new Word("Orange", "Naarangee", R.drawable.orange));
        colors.add(new Word("Yellow", "Peela", R.drawable.yellow));
        colors.add(new Word("Green", "Hara", R.drawable.green));
        colors.add(new Word("Blue", "Neela", R.drawable.blue));
        colors.add(new Word("Purple", "Bainganee", R.drawable.purple));
        colors.add(new Word("Pink", "Gulaabee", R.drawable.pink));
        colors.add(new Word("Brown", "Bhoora", R.drawable.brown));
        colors.add(new Word("Black", "Kaala", R.drawable.black));
        colors.add(new Word("White", "Safed", R.drawable.white));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.listColors);
        listView.setAdapter(adapter);

    }

}