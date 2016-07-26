package com.spring.mvc.service;

import java.util.List;

import com.spring.mvc.model.User;

public interface UserService {

	public User getUserById(int id);

	public void addUser(User user);

	public void updateUser(User user);

	public void removeUser(User user);

	public List<User> getUserList();

}
