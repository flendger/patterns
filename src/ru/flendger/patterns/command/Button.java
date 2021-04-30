package ru.flendger.patterns.command;

public interface Button {
    void click();
    void setCommand(Command command);
}
