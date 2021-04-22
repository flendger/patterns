package ru.flendger.patterns.decorator;

public class SmsSender extends BaseDecorator{
    public SmsSender(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send() {
        System.out.println("send via SMS");
        notificator.send();
    }
}
