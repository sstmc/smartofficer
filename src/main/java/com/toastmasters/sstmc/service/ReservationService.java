package com.toastmasters.sstmc.service;

import java.sql.Date;
import java.util.List;

import com.toastmasters.sstmc.entities.Reservation;

public interface ReservationService {
	
	boolean add(Reservation reservation);

	boolean deleteAll();

    List<Reservation> list();
    
    List<Reservation> getByDate(Date date);
}
