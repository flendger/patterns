package ru.flendger.patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        SportCarBuilder carBuilder = new SportCarBuilder();

        CarBuilderDirector director = new CarBuilderDirector();
        director.makeSportCar(carBuilder);

        carBuilder.getResult().drive();

        SportCarDocBuilder docBuilder = new SportCarDocBuilder();
        docBuilder.setEngine(new SportCarEngine());
        docBuilder.addWheel();
        docBuilder.addWheel();
        docBuilder.addWheel();
        docBuilder.addWheel();
        docBuilder.getResult().read();
    }
}
