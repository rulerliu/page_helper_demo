package com.mayikt.mapper;

import com.mayikt.entity.User;

import java.util.List;

public interface UserMapper {
 
    User selectById(int id);

    List<User> selectAll();
}