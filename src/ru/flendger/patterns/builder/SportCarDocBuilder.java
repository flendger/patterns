package ru.flendger.patterns.builder;

public class SportCarDocBuilder implements CarBuilder {
    private SportCarDoc carDoc;
    private Engine engine;
    private int wheelsCount;

    @Override
    public void addWheel() {
        this.wheelsCount++;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarDoc getResult() {
        carDoc = new SportCarDoc();
        carDoc.setEngine(engine);
        carDoc.setWheelsCount(wheelsCount);
        return carDoc;
    }
}
