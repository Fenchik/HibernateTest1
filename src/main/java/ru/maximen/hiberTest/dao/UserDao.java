package ru.maximen.hiberTest.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.maximen.hiberTest.models.Auto;
import ru.maximen.hiberTest.models.User;
import ru.maximen.hiberTest.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDao {

    public User findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();3

        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public Auto findAutoById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class,id);
    }

    public List<User> findAll(){
        List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }

}
