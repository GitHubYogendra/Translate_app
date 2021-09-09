package com.example.trasulationapp;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class wordAddaperforFamily extends ArrayAdapter<wordForFamily> {
    private int mbackgroungid;
    public wordAddaperforFamily(Activity context, ArrayList<wordForFamily> wordFamily,int backgroungid) {
        super(context,0,wordFamily);
        mbackgroungid = backgroungid;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        wordForFamily currentword = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_item);
        nameTextView.setText(currentword.getmMakowFamily());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_item);
        numberTextView.setText(currentword.getmEnglishFamily());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);
        image.setImageResource(currentword.getmImageTranslution());

        View trxtcolor = listItemView.findViewById(R.id.color_match);
        int color = ContextCompat.getColor(getContext(),mbackgroungid);
        trxtcolor.setBackgroundColor(color);

        return listItemView;
    }
}
