package com.toastmasters.sstmc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toastmasters.sstmc.dao.UserDao;
import com.toastmasters.sstmc.entities.User;
import com.toastmasters.sstmc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public boolean add(User user) {
		return userDao.add(user);
	}

	public boolean deleteAll() {
		return userDao.deleteAll();
	}

	public List<User> list() {
		return userDao.list();
	}

	public List<User> getByClub(String club) {
		return userDao.getByClub(club);
	}

	public List<User> getByName(String name) {
		return userDao.getByName(name);
	}

	public User get(String club, String name) {
		return userDao.get(club, name);
	}
	
}
