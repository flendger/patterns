package ru.flendger.patterns.command;

public class CommandImp1 implements Command{
    private final DBService1 service1;

    public CommandImp1(DBService1 service1) {
        this.service1 = service1;
    }

    @Override
    public void execute() {
        service1.getData();
    }
}
