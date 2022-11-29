package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void addUser(User user);

    void deleteUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
