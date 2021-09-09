package com.example.trasulationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family2);

        final ArrayList<wordPhases> wordFamily = new ArrayList<wordPhases>();
        wordFamily.add(new wordPhases("minto wuksus", "Where are you going?",R.raw.phrase_where_are_you_going));
        wordFamily.add(new wordPhases("tinnә oyaase'nә", "What is your name?",R.raw.phrase_what_is_your_name));
        wordFamily.add(new wordPhases("oyaaset...", "My name is...",R.raw.phrase_my_name_is));
        wordFamily.add(new wordPhases("michәksәs?", "How are you feeling?",R.raw.phrase_how_are_you_feeling));
        wordFamily.add(new wordPhases("kuchi achit", "I’m feeling good.",R.raw.phrase_im_feeling_good));
        wordFamily.add(new wordPhases("әәnәs'aa?", "Are you coming?",R.raw.phrase_are_you_coming));
        wordFamily.add(new wordPhases("hәә’ әәnәm", "Yes, I’m coming",R.raw.phrase_yes_im_coming));
        wordFamily.add(new wordPhases("әәnәm", "I’m coming.",R.raw.phrase_im_coming));
        wordFamily.add(new wordPhases("yoowutis.", "Let’s go.",R.raw.phrase_lets_go));
        wordFamily.add(new wordPhases("әnni'nem", "Come here.",R.raw.phrase_come_here));

        wordAddapterForPhases member = new wordAddapterForPhases(this, wordFamily);
        ListView family = (ListView) findViewById(R.id.lis_family);
        family.setAdapter(member);
        family.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                wordPhases i = wordFamily.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, i.getMaudiotranslution());
                mediaPlayer.start();
            }
        });
    }
    @Override
    protected void onStop(){
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