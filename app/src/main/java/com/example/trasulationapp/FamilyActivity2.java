package com.example.trasulationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity2 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family2);

       final  ArrayList<wordForFamily> wordFamily = new ArrayList<wordForFamily>();
        wordFamily.add( new wordForFamily("әpә","father",R.drawable.family_father,R.raw.family_father));
        wordFamily.add(new wordForFamily("әṭa","mother",R.drawable.family_mother,R.raw.family_mother));
        wordFamily.add(new wordForFamily("angsi","son",R.drawable.family_son,R.raw.family_son));
        wordFamily.add(new wordForFamily("tune","daughter",R.drawable.family_daughter,R.raw.family_daughter));
        wordFamily.add(new wordForFamily("taachi","older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        wordFamily.add(new wordForFamily("chalitti","younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        wordFamily.add(new wordForFamily("teṭe","older sister",R.drawable.family_younger_sister,R.raw.family_older_sister));
        wordFamily.add(new wordForFamily("kolliti","younger sister",R.drawable.family_older_sister,R.raw.family_younger_sister));
        wordFamily.add(new wordForFamily("ama","grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        wordFamily.add(new wordForFamily("paapa","grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));

        wordAddaperforFamily member = new wordAddaperforFamily(this, wordFamily,R.color.category_family);
        ListView family = (ListView) findViewById(R.id.lis_family);
        family.setAdapter(member);

        family.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                wordForFamily i = wordFamily.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(FamilyActivity2.this, i.getMaudiotranslution());
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