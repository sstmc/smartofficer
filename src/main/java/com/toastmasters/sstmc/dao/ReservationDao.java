package com.toastmasters.sstmc.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.toastmasters.sstmc.entities.Reservation;

@Mapper
public interface ReservationDao {
	
	boolean add(Reservation reservation);

	boolean deleteAll();

    List<Reservation> list();
    
    List<Reservation> getByDate(Date date);
}
