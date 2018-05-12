package com.it.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * Created by wangzy on 2018/5/11.
 */
public class DaoTest {

    public void ss() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        System.out.println(sessionFactory.toString());
    }
}
