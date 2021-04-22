package ru.flendger.patterns.decorator;

public class VkSender extends BaseDecorator{
    public VkSender(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send() {
        System.out.println("send via VK");
        notificator.send();
    }
}
