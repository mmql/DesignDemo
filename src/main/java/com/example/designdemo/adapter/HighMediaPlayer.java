package com.example.designdemo.adapter;

/*
 * 先进的播放器， 可播放MP5和Vlc 文件
 */
public interface HighMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}
