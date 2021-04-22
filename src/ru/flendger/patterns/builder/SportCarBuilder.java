package ru.flendger.patterns.builder;

public class SportCarBuilder implements CarBuilder {
    private SportCar car;
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

    public Car getResult() {
        car = new SportCar();
        car.setEngine(engine);
        car.setWheelsCount(wheelsCount);
        return car;
    }
}
