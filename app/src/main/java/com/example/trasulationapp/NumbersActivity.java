package com.example.trasulationapp;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
private MediaPlayer mediaPlayer;


private MediaPlayer.OnCompletionListener mcompleteListener = (mediaPlayer1) -> {
    releaseMediaPlayer();
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("One","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new word("Two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new word("Three","tolookosa",R.drawable.number_three,R.raw.number_three));
        words.add(new word("Four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new word("Five","massoka",R.drawable.number_five,R.raw.number_five));
        words.add(new word("Six","temmoka",R.drawable.number_six,R.raw.number_six));
        words.add(new word("Seven","keneka",R.drawable.number_seven,R.raw.number_seven));
        words.add(new word("Eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new word("Nine","wo,e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new word("Ten","na,achha",R.drawable.number_ten,R.raw.number_ten));

        wordAdapter itemsAdapter = new wordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                word i = words.get(position);

                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, i.getMaudiotranslution());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mcompleteListener);
            }
        });

    }
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
    private void releaseMediaPlayer(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}