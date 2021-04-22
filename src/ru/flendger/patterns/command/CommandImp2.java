package ru.flendger.patterns.command;

public class CommandImp2 implements Command{
    private final DBService2 service2;

    public CommandImp2(DBService2 service1) {
        this.service2 = service1;
    }

    @Override
    public void execute() {
        service2.getInfo();
    }
}
