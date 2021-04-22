package ru.flendger.patterns.chainofresponsibility;

public class StopLabelChainItem extends AbstractChainItem{
    @Override
    public void doWork(String response) {
        if (response.equals("stopLabel")) {
            System.out.println("Stop by " + this.getClass().getSimpleName());
            return;
        }
        System.out.println("Do work by: " + this.getClass().getSimpleName());
        super.doWork(response);
    }
}
