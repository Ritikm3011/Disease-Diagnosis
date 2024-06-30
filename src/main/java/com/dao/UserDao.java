package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.entity.User;

public class UserDao {
	private SessionFactory factory;
	private Session session;
	private Transaction txn;

	public UserDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	
	public boolean signUp(User user) {
		boolean f = false;
		try {
			session = factory.openSession();
			txn = session.beginTransaction();

			session.save(user);
			txn.commit();
			f = true;
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in UserDao.signUp");
		}

		return f;
	}
	
	
	
	public User login(String email, String password) {
		User user = null;
		try {
			session = factory.openSession();
			Query query = session.createQuery("from User where email=:em and password=:ps");
			query.setParameter("em", email);
			query.setParameter("ps", password);

			user = (User) query.uniqueResult();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in UserDao.login");
		}
		return user;
	}
	
}
