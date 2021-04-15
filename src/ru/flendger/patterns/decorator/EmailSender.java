package ru.flendger.patterns.decorator;

public class EmailSender implements Notificator {
    @Override
    public void send() {
        System.out.println("send via email");
    }
}
