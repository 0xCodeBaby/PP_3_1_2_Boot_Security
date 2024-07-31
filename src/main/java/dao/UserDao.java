package dao;


import model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);

    List<User> getUsers(int count);
    User getUserById(Long id);
}