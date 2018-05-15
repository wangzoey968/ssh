package com.it.dao.impl;

import com.it.dao.inter.UserDaoInter;
import com.it.pojo.Tb_User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by wangzy on 2018/5/15.
 */
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDaoInter {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Tb_User selectUser() {
        Session session = sessionFactory.openSession();
        Tb_User user = new Tb_User();
        user.setAddress("1");
        user.setCreated(1111L);
        user.setPhone("13200000000");
        user.setUsername("lao");
        session.save(user);
        return user;
    }
}
