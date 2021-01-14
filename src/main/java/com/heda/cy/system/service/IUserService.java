package com.heda.cy.system.service;

import com.heda.cy.system.pojo.User;

import java.util.List;

public interface IUserService {
    User login(User user);

    List<User> userList(User user);

    void add(User user);

    void update(User user);

    void del(User user);
}
