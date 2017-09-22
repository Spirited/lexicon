package com.kompanets.lexicon.model;

import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by spirited on 15.06.2017.
 */
@Component
@Transactional
public class UserRepositoryImp implements UserRepository {
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int userId) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public boolean userExists(String firsrName, String lastName) {
        return false;
    }
}
