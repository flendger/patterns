package ru.flendger.patterns.bridge;

public class MediaPlayerImp implements MediaPlayer {
    private final MediaStation mediaStation;

    public MediaPlayerImp(MediaStation mediaStation) {
        this.mediaStation = mediaStation;
    }

    @Override
    public void switchOn() {
        mediaStation.toggle(true);
    }

    @Override
    public void switchOff() {
        mediaStation.toggle(false);
    }

    @Override
    public void incVolume() {
        mediaStation.setVolume(mediaStation.getVolume() + 1);
    }

    @Override
    public void decVolume() {
        mediaStation.setVolume(mediaStation.getVolume() - 1);
    }

    @Override
    public void incChannel() {
        mediaStation.setChannel(mediaStation.getChannel() + 1);
    }

    @Override
    public void decChannel() {
        mediaStation.setChannel(mediaStation.getChannel() - 1);
    }
}
