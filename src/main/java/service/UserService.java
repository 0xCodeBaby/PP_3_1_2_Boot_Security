package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers(int count);
    User getUserById(Long id);

    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}