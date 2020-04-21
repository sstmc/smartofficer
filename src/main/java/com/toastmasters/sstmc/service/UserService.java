package com.toastmasters.sstmc.service;

import java.util.List;

import com.toastmasters.sstmc.entities.User;

public interface UserService {
	
	boolean add(User user);

	boolean deleteAll();

    List<User> list();
    
    List<User> getByClub(String club);

    List<User> getByName(String name);
    
    User get(String club, String name);
}
