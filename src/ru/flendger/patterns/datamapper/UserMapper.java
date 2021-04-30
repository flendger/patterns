package ru.flendger.patterns.datamapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserMapper {
    private final Connection connection;

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    public Optional<User> findById(Long id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select id, username, password, email from users where id=?");
        statement.setLong(1, id);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            User user = new User(resultSet.getLong(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4));
            return Optional.of(user);
        }

        return Optional.empty();
    }

    public void saveOrUpdate(User user) throws SQLException {
        PreparedStatement statement;
        if (user.getId() == null) {
            //insert
            statement = connection.prepareStatement("insert into users (username, password, email) values (?, ?, ?)");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
        } else {
            //update
            statement = connection.prepareStatement("update users set username=?, password=?, email=? where id=?");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setLong(4, user.getId());
        }
        statement.executeUpdate();
    }

    public void delete(User user) throws SQLException {
        PreparedStatement statement;
        statement = connection.prepareStatement("delete from users where id=?");
        statement.setLong(1, user.getId());
        statement.executeUpdate();
    }
}
