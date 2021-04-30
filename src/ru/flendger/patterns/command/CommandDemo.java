package ru.flendger.patterns.command;

public class CommandDemo {
    public static void main(String[] args) {
        Command command1 = new CommandImp1(new DBService1());
        Button button1 = new PushButton();
        button1.setCommand(command1);

        Command command2 = new CommandImp2((new DBService2()));
        Button button2 = new PanelButton();
        button2.setCommand(command2);

        button1.click();
        button2.click();
    }
}
