package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.entity.Result;
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
	
	public boolean storeResult(Result result) {
		boolean f = false;
		
		try {
			session = factory.openSession();
			txn = session.beginTransaction();

			session.save(result);
			txn.commit();
			f = true;
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in UserDao.storeResult");
		}
		
		
		return f;
		
	}
	
	public List<Result> getResult(int userId) {
		List<Result> resultList = null;

		try {
			session = factory.openSession();
			Query query = session.createQuery("from Result where userId=:id");
			query.setParameter("id", userId);

			resultList = query.list();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in AdminDao.getAllExam");
		}

		return resultList;
	}
	
	
}
