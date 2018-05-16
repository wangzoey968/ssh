package com.it.controller;

import com.it.pojo.Tb_User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

/**
 * Created by wangzy on 2018/5/16.
 */
public class HibernateTest {

    @Test
    public void ss() {
        try {
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            SessionFactory sf = configuration.buildSessionFactory(serviceRegistry);
            Tb_User user = new Tb_User();
            user.setUsername("1111");
            user.setPhone("1111111111");
            user.setCreated(111L);
            user.setAddress("333333333333333333");
            user.setRemark("2222222222222223333333333");
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            session.save(user);
            tx.commit();
            session.close();
            sf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
