package com.mayikt.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mayikt.entity.User;
import com.mayikt.mapper.UserMapper;
import com.mayikt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/8/21 0021 上午 11:44
 * @version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectAll() {
        // 获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(2, 5);
        // 用PageInfo对结果进行包装
        List<User> users = userMapper.selectAll();
        PageInfo page = new PageInfo(users);
        //测试PageInfo全部属性
        //PageInfo包含了非常全面的分页属性
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页显示数量：" + page.getPageSize());
        System.out.println(page.getStartRow());
        System.out.println(page.getEndRow());
        System.out.println("总数量：" + page.getTotal());
        System.out.println("当前页查询记录：" + page.getList().size());
        System.out.println("总页数：" + page.getPages());
//        System.out.println(page.getFirstPage());
//        System.out.println(page.getLastPage());
        System.out.println(page.isIsFirstPage());
        System.out.println(page.isIsLastPage());
        System.out.println(page.isHasPreviousPage());
        System.out.println(page.isHasNextPage());
        return users;
    }
}
