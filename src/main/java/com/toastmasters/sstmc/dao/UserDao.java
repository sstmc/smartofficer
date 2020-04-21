package com.toastmasters.sstmc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.toastmasters.sstmc.entities.User;

@Mapper
public interface UserDao {
	
	boolean add(User user);

	boolean deleteAll();

    List<User> list();
    
    List<User> getByClub(String club);

    List<User> getByName(String name);
    
    User get(@Param("club") String club, @Param("name") String name);
}
