package ru.flendger.patterns.builder;

public class SportCar implements Car{
    private Engine engine;
    private int wheelsCount;

    @Override
    public void drive() {
        System.out.println("Sport car drive: " + engine + " wheels: " + wheelsCount);
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
