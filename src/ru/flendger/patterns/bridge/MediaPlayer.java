package ru.flendger.patterns.bridge;

public interface MediaPlayer {
    void switchOn();
    void switchOff();
    void incVolume();
    void decVolume();
    void incChannel();
    void decChannel();
}
