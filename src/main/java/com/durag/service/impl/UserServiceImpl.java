package com.durag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durag.dao.UserDao;
import com.durag.model.User;
import com.durag.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAllUsers() {
		return userDao.findAll();
	}

	@Override
	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	@Override
	public User save(User user) {
		return userDao.save(user);
	}

	
	
}
