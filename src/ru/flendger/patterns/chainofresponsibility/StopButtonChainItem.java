package ru.flendger.patterns.chainofresponsibility;

public class StopButtonChainItem extends AbstractChainItem{
    @Override
    public void doWork(String response) {
        if (response.equals("stopButton")) {
            System.out.println("Stop by " + this.getClass().getSimpleName());
            return;
        }
        System.out.println("Do work by: " + this.getClass().getSimpleName());
        super.doWork(response);
    }
}
