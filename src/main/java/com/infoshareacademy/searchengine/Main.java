package com.infoshareacademy.searchengine;

import com.infoshareacademy.searchengine.domain.User;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDaoBean;

public class Main {

    public static void main(String[] args) {

        UsersRepositoryDao DaoBean = new UsersRepositoryDaoBean();
        for ( User user: DaoBean.getUsersList()) {
            System.out.println(user.getName());
        }

    }


}