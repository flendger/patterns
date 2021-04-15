package ru.flendger.patterns.builder;

public class SportCarEngine implements Engine{
    private int volume;

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SpEngine vol= " + volume;
    }
}
