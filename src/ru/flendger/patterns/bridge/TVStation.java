package ru.flendger.patterns.bridge;

public class TVStation implements MediaStation {
    private int volume = 1;
    private int channel = 1;
    private boolean isOn = false;

    @Override
    public void setVolume(int volume) {
        if (volume > 0 && volume <= 15) {
            this.volume = volume;
        }
        System.out.println("tv volume: " + this.volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void toggle(boolean on) {
        isOn = on;
        System.out.println("tv on/off: " + this.isOn);
    }

    @Override
    public void setChannel(int channel) {
        if (channel > 0 && channel <= 50) {
            this.channel = channel;
        }
        System.out.println("tv channel: " + this.channel);
    }

    @Override
    public int getChannel() {
        return channel;
    }
}
