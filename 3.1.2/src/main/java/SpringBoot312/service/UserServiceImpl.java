package SpringBoot312.service;

import SpringBoot312.dao.UserDAO;
import SpringBoot312.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public void add(User user) {
        userDAO.add(user);
    }
    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }
    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }
    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }
}
