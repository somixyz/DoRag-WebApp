package com.durag.service;

import java.util.List;

import com.durag.model.User;

public interface UserService{

	List<User> findAllUsers();

	User findByUserName(String userName);

	User save(User user);
 
}
