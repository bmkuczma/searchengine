package com.infoshareacademy.searchengine.domain.dao;

import com.infoshareacademy.searchengine.domain.User;
import com.infoshareacademy.searchengine.domain.searchengine.UsersRepository;

import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao{


    @Override
    public void addUser(User user) {
        UsersRepository.getRepository().add(user);
    }

    @Override
    public User getUserByid(int id) {
        List<User> userList = UsersRepository.getRepository();
        for(User user : userList)
        {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public String getUserByLogin(String login) {
        List<User> userList = UsersRepository.getRepository();
        for (User user : userList){
            if (user.getLogin() == login){
                return login;
            }
        }

        return null;
    }

    @Override
    public List<User> getUsersList() {

        return null;
    }
}
