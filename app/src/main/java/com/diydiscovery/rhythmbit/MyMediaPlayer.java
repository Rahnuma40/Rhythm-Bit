package com.diydiscovery.rhythmbit;

import android.media.MediaPlayer;

public class MyMediaPlayer {
    static MediaPlayer instance;
    static MediaPlayer getInstance(){
        if(instance==null){
            instance=new MediaPlayer();
        }
        return instance;
    }
    public static int currentIndex=-1;
}
