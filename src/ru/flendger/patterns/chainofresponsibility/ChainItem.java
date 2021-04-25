package ru.flendger.patterns.chainofresponsibility;

public interface ChainItem {
    void doWork(String response);
    void setNext(ChainItem nextItem);
}
