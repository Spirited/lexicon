package com.kompanets.lexicon.model;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by spirited on 15.06.2017.
 */
@Service
public interface UserRepository {
    List<User> getAllUsers();
    User getUserById(int userId);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    boolean userExists(String firsrName, String lastName);
}
