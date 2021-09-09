package com.example.trasulationapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {
   private int mbackgroungid;

   public wordAdapter(Activity context, ArrayList<word> words, int backgroungid) {
        super(context,0,words);
        mbackgroungid=backgroungid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentword = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_item);
        nameTextView.setText(currentword.getMmiwokTranslution());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_item);
        numberTextView.setText(currentword.getmDefaultTranslution());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);
        image.setImageResource(currentword.getmImageTranslution());

        View trxtcolor = listItemView.findViewById(R.id.color_match);
        int color = ContextCompat.getColor(getContext(),mbackgroungid);
        trxtcolor.setBackgroundColor(color);


        return listItemView;
    }

}
