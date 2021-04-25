package ru.flendger.patterns.datamapper.identitymap;

import ru.flendger.patterns.datamapper.User;
import ru.flendger.patterns.datamapper.UserMapper;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserIdentityMap {
    private UserIdentityMap instance;
    private final Map<Long, User> userMap = new HashMap<>();
    private final UserMapper userMapper;

    public UserIdentityMap getInstance(UserMapper userMapper) {
        if (instance == null) {
            instance = new UserIdentityMap(userMapper);
        }

        return instance;
    }

    private UserIdentityMap(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Optional<User> get(Long id) throws SQLException {
        if (userMap.containsKey(id)) {
            return Optional.of(userMap.get(id));
        } else {
            Optional<User> optionalUser = userMapper.findById(id);
            if (optionalUser.isPresent()) {
                User user = optionalUser.get();
                userMap.put(user.getId(), user);
            }
            return optionalUser;
        }
    }
}
