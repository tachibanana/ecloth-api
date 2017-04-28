package com.javar.dev.ecloth.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javar.dev.ecloth.dao.UserDao;
import com.javar.dev.ecloth.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUserById(long id) {
		User user = null;
		try{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			user = (User) session.get(User.class, id);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User getUsers(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		List<User> listOfUser = new ArrayList<User>();
		Query query = null;

		try{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			query = (Query) session.createQuery("from User");
			session.getTransaction().commit();
			
			for(Object objUser : query.list())
				listOfUser.add((User) objUser); 
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return listOfUser;
	}

	@Override
	public User addUser(User user) {
		try{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public User updateUserById(long id, User user) {
		User oldUser = null;
		try{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			oldUser = session.get(User.class, user.getUserId());
			oldUser.setUsername(user.getUsername());
			oldUser.setPassword(user.getPassword());
			oldUser.setEmail(user.getEmail());
			oldUser.setFirstName(user.getFirstName());
			oldUser.setLastName(user.getLastName());
			oldUser.setAccessType(user.getAccessType());
			oldUser.setActivated(user.isActivated());
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User updateUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(long id) {
		User user = null;
		try{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			user = session.get(User.class, id);
			session.delete(user);
			session.getTransaction().commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User deleteUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}