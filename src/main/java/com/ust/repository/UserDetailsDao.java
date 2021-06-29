package com.ust.repository;

import java.util.List;

import com.ust.model.User;

public interface UserDetailsDao {
	
	User findByUserName(String userName);
	void save(User user);
	List<User> findAll();
	User findByUserId(int userId);
	void delete(int userId);
	void update(User user);
}