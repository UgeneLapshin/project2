package com.levelup.dao;

import com.levelup.model.User;
import java.util.List;

public interface UserRepository {

    User saveUser(User user);
    User updateUser(User user);
    void removeUser(User user);
    User getUserById(Long id);
    List<User> getAllUser();
}
