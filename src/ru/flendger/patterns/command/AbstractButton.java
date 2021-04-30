package ru.flendger.patterns.command;

public abstract class AbstractButton implements Button{
    protected Command command;

    @Override
    public void click() {
        if (command == null) return;

        command.execute();
    }

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }
}
