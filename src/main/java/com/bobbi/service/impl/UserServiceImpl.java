package com.bobbi.service.impl;

import com.bobbi.dao.UserDao;
import com.bobbi.domain.User;
import com.bobbi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by bobbi on 18/3/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User selectByUserName(String userName) {
        return userDao.selectByUserName(userName);
    }

    @Override
    public Set<String> getRoles(String userName) {
        return userDao.getRoles(userName);
    }

    @Override
    public Set<String> getPermissions(String userName) {
        return userDao.getPermissions(userName);
    }
}