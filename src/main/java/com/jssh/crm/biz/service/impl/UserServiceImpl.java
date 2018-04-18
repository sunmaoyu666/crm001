package com.jssh.crm.biz.service.impl;

import com.jssh.crm.biz.dao.UserDao;
import com.jssh.crm.biz.model.User;
import com.jssh.crm.biz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by S on 2018/4/18
 * 测试环境
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User queryUserById(int id) {
        return userDao.get(id);
    }
}
