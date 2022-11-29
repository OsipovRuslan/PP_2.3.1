package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void addUser(User user);

    void deleteUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
