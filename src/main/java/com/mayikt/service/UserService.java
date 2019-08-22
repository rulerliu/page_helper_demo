package com.mayikt.service;

import com.mayikt.entity.User;

import java.util.List;

public interface UserService {

    User selectById(int id);

    List<User> selectAll();

}
