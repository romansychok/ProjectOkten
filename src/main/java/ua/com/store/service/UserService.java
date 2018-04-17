package ua.com.store.service;

import ua.com.store.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);
    List<User> findAll();
    User findByUserName(String username);
    User findOne(int id);

    void delete(int id);
    void update(User user);


}
