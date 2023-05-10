package SpringBoot312.dao;


import SpringBoot312.model.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    User getUserById(Long id);
    List<User> listUsers();
    void updateUser(User user);
    void deleteUser(Long id);
}
