package ru.flendger.patterns.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        MediaPlayer player;
        player = new MediaPlayerImp(new RadioStation());
        player.switchOn();
        player.incVolume();
        player.incVolume();
        player.decVolume();
        player.incChannel();
        player.decChannel();
        player.switchOff();

        System.out.println();

        player = new MediaPlayerImp(new TVStation());
        player.switchOn();
        player.incVolume();
        player.incVolume();
        player.decVolume();
        player.incChannel();
        player.decChannel();
        player.switchOff();
    }
}
