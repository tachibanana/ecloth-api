package com.javar.dev.ecloth.dao;

import java.util.List;

import com.javar.dev.ecloth.model.User;

public interface UserDao {

	public User getUserById(long id);
	public User getUsers(String username);
	public List<User> getAllUser();
	public User addUser(User user);
	public User updateUserById(long id, User user);
	public User updateUsers(User user);
	public User deleteUserById(long id);
	public User deleteUsers(User user);

}
