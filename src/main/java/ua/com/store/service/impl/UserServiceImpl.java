package ua.com.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.store.dao.UserDAO;
import ua.com.store.entity.User;
import ua.com.store.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService,UserDetailsService {

    @Autowired
    private UserDAO dao;

    @Autowired
    private PasswordEncoder encoder;



    @Override
    public void save(User user)  {
        String password = user.getPassword();
        String encode = encoder.encode(password);
        user.setPassword(encode);
        dao.save(user);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User findByUserName(String name) {
        return dao.findByUserName(name);
    }

    @Override
    public User findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public void update(User user) {
            dao.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByUserName(username);
    }
}
