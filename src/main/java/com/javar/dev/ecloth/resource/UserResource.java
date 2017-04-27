package com.javar.dev.ecloth.resource;

import java.util.List;

import com.javar.dev.ecloth.model.User;

public interface UserResource {

	public User getUserById(long id);
	public User getUserByUsername(String username);
	public List<User> getAllUser();
	public User addUser(User user);
	public User updateUser(long id, User user);
	public User deleteUserById(long id);
}
