package ru.flendger.patterns.mvc.controller;

import ru.flendger.patterns.mvc.model.User;
import ru.flendger.patterns.mvc.services.UserService;

import java.util.NoSuchElementException;

public class UserController {
    private static UserController userController;
    private final UserService userService;

    private UserController() {
        userService = UserService.getInstance();
    }

    public static UserController getInstance() {
        if (userController == null) {
            userController = new UserController();
        }

        return userController;
    }

    public User getUserByName(String username) {
        return userService.getByUsername(username).orElseThrow(() -> new NoSuchElementException("User not found"));
    }
}
