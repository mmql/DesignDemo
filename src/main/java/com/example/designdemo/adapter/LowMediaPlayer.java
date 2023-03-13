package com.example.designdemo.adapter;

/**
 * 老版媒体 播放器，只能播放MP3，只有单一播放MP3功能选项
 */
public interface LowMediaPlayer {
    void play(String audioType, String fileName);
}
