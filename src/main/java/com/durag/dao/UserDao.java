package com.durag.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.durag.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long>{

	List<User> findAll();
	
	User findByUserName(String userName);
	
	User findByUserId(Long id);
	
	User save(User user);
	
}
