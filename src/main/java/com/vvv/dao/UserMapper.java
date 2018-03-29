package com.vvv.dao;

import com.vvv.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by vvv on 2018/3/29.
 */
@Repository
public interface UserMapper {
    void insert(User user);
}
