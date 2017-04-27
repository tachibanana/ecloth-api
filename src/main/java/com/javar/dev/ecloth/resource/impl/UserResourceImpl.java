package com.javar.dev.ecloth.resource.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javar.dev.ecloth.model.User;
import com.javar.dev.ecloth.resource.UserResource;
import com.javar.dev.ecloth.service.impl.UserServiceImpl;

@Component
@Path("/")
public class UserResourceImpl implements UserResource{

	@Autowired
	private UserServiceImpl userService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("user/{userId}")
	@Override
	public User getUserById(@PathParam("userId") long id) {
		return userService.getUserById(id);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("users")
	@Override
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("user")
	@Override
	public User addUser(User user) {
		return userService.addUser(user);
	}

	@Override
	public User updateUser(long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}