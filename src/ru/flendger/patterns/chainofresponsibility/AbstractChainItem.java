package ru.flendger.patterns.chainofresponsibility;

public abstract class AbstractChainItem implements ChainItem{
    private ChainItem nextItem;

    @Override
    public void doWork(String response) {
        if (nextItem != null) {
            nextItem.doWork(response);
        }
    }

    @Override
    public void setNext(ChainItem nextItem) {
        this.nextItem = nextItem;
    }
}
