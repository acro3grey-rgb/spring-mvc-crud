package com.serg.service;

import com.serg.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    void updateUser(User user);
}