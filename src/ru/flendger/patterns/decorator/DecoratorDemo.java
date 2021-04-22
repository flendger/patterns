package ru.flendger.patterns.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Notificator notificator = new EmailSender();
        notificator.send();

        System.out.println();

        notificator = new SmsSender(notificator);
        notificator.send();

        System.out.println();

        notificator = new VkSender(notificator);
        notificator.send();
    }
}
