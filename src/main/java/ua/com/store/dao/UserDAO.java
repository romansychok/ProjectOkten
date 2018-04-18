package ua.com.store.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.store.entity.User;

import java.util.List;

public interface UserDAO extends JpaRepository<User,Integer> {

    @Query("from User u where u.username=:name")
    User findByUserName(@Param("name") String name);




}
