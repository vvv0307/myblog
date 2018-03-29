package com.vvv.service.impl;

import com.vvv.dao.UserMapper;
import com.vvv.pojo.User;
import com.vvv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vvv on 2018/3/29.
 */
@Service("UserService")
public class IUserService implements UserService {
    @Autowired
    private UserMapper usermapper;

    public void  register(User user) {
        usermapper.insert(user);
    }
}
