package com.example.trasulationapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAddapterForPhases extends ArrayAdapter<wordPhases> {


    public wordAddapterForPhases(Activity context, ArrayList<wordPhases> wordPhases) {
        super(context,0,wordPhases);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.phases_item, parent, false);
        }

        wordPhases currentword = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_item);
        nameTextView.setText(currentword.mmiwokTranslution());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_item);
        numberTextView.setText(currentword.getmEnglishFamily());

        return listItemView;
    }
}
