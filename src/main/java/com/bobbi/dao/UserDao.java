package com.bobbi.dao;

import com.bobbi.domain.User;

import java.util.Set;

/**
 * Created by bobbi on 18/3/19.
 */
public interface UserDao {

    User selectByUserName(String userName);

    Set<String> getRoles(String userName);

    Set<String> getPermissions(String userName);
}
