package ru.flendger.patterns.bridge;

public interface MediaStation {
    void setVolume(int volume);
    int getVolume();
    void toggle(boolean on);
    void setChannel(int channel);
    int getChannel();
}
