package com.infoshareacademy.searchengine.domain.dao;

import com.infoshareacademy.searchengine.domain.User;

import java.util.List;

public interface UsersRepositoryDao  {

    void addUser(User user);

    User getUserByid(int id);

    String getUserByLogin(String login);

    List<User> getUsersList();
}
