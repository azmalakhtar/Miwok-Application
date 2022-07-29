package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String english;
    private String miwok;
    private int resourceId=-1;
    private int audioResourceId;
    public Word(String english,String miwok,int audioResourceId){
        this.english=english;
        this.miwok=miwok;
        this.audioResourceId=audioResourceId;
    }
    public Word(String english,String miwok,int resourceId,int audioResourceId){
        this.english=english;
        this.miwok=miwok;
        this.resourceId=resourceId;
        this.audioResourceId=audioResourceId;
    }
    public String getEnglish() {
        return english;
    }

    public String getMiwok() {
        return miwok;
    }
    public int getResourceId() {
        return resourceId;
    }
    public int getAudioResourceId(){return audioResourceId;}
    boolean hasImage(){
        return resourceId!=-1;
    }
}
