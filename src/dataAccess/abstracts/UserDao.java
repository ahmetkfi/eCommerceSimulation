package dataAccess.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    List<User> findAllUsers();
}
