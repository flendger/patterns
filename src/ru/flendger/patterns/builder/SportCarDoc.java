package ru.flendger.patterns.builder;

public class SportCarDoc implements CarDoc{
    private Engine engine;
    private int wheelsCount;

    @Override
    public void read() {
        System.out.println("Sport car doc read");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
