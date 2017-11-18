package com.infoshareacademy.searchengine;

import com.infoshareacademy.searchengine.domain.User;
import com.infoshareacademy.searchengine.domain.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.domain.dao.UsersRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.searchengine.UsersRepository;

public class Main {
    public void main (String args[]) {
        UsersRepositoryDao daoBean = new UsersRepositoryDaoBean();
        for(User user : daoBean.getUserList())
            System.out.println(user);



    }
}
