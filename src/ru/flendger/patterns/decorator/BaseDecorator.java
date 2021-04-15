package ru.flendger.patterns.decorator;

public class BaseDecorator implements Notificator{
    protected final Notificator notificator;

    public BaseDecorator(Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public void send() {
        notificator.send();
    }
}
