package ru.flendger.patterns.mvc;

import ru.flendger.patterns.mvc.controller.UserController;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CLIView {
    public static void main(String[] args) {
        UserController userController = UserController.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username >>> ");
            String cmd = scanner.nextLine();
            if (cmd.equals("/exit")) {
                break;
            }
            try {
                System.out.println(userController.getUserByName(cmd));
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
