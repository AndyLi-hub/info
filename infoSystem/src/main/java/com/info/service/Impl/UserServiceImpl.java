package com.info.service.Impl;

import com.info.dao.UserDao;
import com.info.entity.User;
import com.info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //bean 注入
    @Autowired
    UserDao userDao;


    @Override
    public User findByUserId(String userid) {
        return userDao.findByUserId(userid);
    }

    @Override
    public User loginIn(String userid, String password) {
        return userDao.loginIn(userid,password);
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }

    @Override
    public User checkUserId(String userid) {
        return userDao.checkUserId(userid);
    }

    @Override
    public boolean regeditOK(User user) {
        return userDao.regeditOK(user);
    }
}
