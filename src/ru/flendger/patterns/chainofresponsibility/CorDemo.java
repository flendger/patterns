package ru.flendger.patterns.chainofresponsibility;

public class CorDemo {
    public static void main(String[] args) {
        ChainItem item2 = new StopLabelChainItem();
        ChainItem item1 = new StopButtonChainItem();
        item1.setNext(item2);

        String resp = "stopButton";
        item1.doWork(resp);

        resp = "stopLabel";
        item1.doWork(resp);

        resp = "to end";
        item1.doWork(resp);
    }
}
