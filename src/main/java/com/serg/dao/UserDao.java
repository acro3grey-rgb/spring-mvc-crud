package com.serg.dao;

import com.serg.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    void updateUser(User user);
}