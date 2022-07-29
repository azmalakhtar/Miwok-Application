package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    int colour;
    MediaPlayer mediaPlayer;
    public WordAdapter(Context context, ArrayList<Word> word,int colour){
        super(context, 0, word);
        this.colour=colour;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_layout, parent, false);
        }
        Word currentWord = getItem(position);

        TextView english = (TextView) listItemView.findViewById(R.id.english);
        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok);
        english.setText(currentWord.getEnglish());
        miwok.setText(currentWord.getMiwok());
        ImageView image=listItemView.findViewById(R.id.image);
        ImageView play=listItemView.findViewById(R.id.play);
        if(currentWord.hasImage()){
            image.setVisibility(View.VISIBLE);
            image.setImageResource(currentWord.getResourceId());
        }
        else{
            image.setVisibility(View.GONE);
        }
//        mediaPlayer =MediaPlayer.create(this,currentWord.getAudioResourceId());
        LinearLayout name_layout=listItemView.findViewById(R.id.name_layout);
        int color= ContextCompat.getColor(getContext(),colour);
        name_layout.setBackgroundColor(color);
        play.setBackgroundColor(color);
        return listItemView;

    }
}
