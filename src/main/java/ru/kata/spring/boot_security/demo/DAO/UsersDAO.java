package ru.kata.spring.boot_security.demo.DAO;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UsersDAO {
    User getUserName(String name);

    List<User> getAllUsers();

    User getUserById(long id);

    void saveNewUser(User user);

    void updateUser(User userUpdate);

    void deleteUserById(long id);
}
