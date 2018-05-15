package com.it.service.impl;

import com.it.dao.inter.UserDaoInter;
import com.it.pojo.Tb_User;
import com.it.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangzy on 2018/5/15.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserServiceInter{

    @Autowired
    UserDaoInter userDaoImpl;

    @Override
    public Tb_User selectUser() {
        Tb_User user = userDaoImpl.selectUser();
        return user;
    }
}
