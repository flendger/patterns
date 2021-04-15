package ru.flendger.patterns.builder;

public class CarBuilderDirector {
    public void makeSportCar(CarBuilder carBuilder) {
        carBuilder.addWheel();
        carBuilder.addWheel();
        carBuilder.addWheel();
        carBuilder.addWheel();
        Engine engine = new SportCarEngine();
        engine.setVolume(3);
        carBuilder.setEngine(engine);
    }
}
