package ru.flendger.patterns.mvc.services;

import ru.flendger.patterns.mvc.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserService {
    private static UserService userService;
    private final Map<String, User> users;

    private UserService() {
        users = new HashMap<>();
        users.put("u1" ,new User("u1", "p1"));
        users.put("u2", new User("u2", "p2"));
        users.put("u3", new User("u3", "p3"));
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }

        return userService;
    }

    public Optional<User> getByUsername(String username) {
        if (!users.containsKey(username)) {
            return Optional.empty();
        }

        return Optional.of(users.get(username));
    }
}
