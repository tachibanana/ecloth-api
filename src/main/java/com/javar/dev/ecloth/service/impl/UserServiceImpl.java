package com.javar.dev.ecloth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javar.dev.ecloth.dao.impl.UserDaoImpl;
import com.javar.dev.ecloth.model.User;
import com.javar.dev.ecloth.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDao;
	
	@Override
	public User getUserById(long id) {
		return userDao.getUserById(id);
	}

	@Override
	public User getUsers(String username) {
		return userDao.getUsers(username);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public User addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User updateUserById(long id, User user) {
		return userDao.updateUserById(id, user);
	}

	@Override
	public User updateUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(long id) {
		return userDao.deleteUserById(id);
	}

	@Override
	public User deleteUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
