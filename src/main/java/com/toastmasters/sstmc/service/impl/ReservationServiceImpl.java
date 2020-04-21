package com.toastmasters.sstmc.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toastmasters.sstmc.dao.ReservationDao;
import com.toastmasters.sstmc.entities.Reservation;
import com.toastmasters.sstmc.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao reservationDao;

	public boolean add(Reservation reservation) {
		return reservationDao.add(reservation);
	}

	public boolean deleteAll() {
		return reservationDao.deleteAll();
	}

	public List<Reservation> list() {
		return reservationDao.list();
	}

	public List<Reservation> getByDate(Date date) {
		System.out.println("get all of the reservations whose date is " + date);
		return reservationDao.getByDate(date);
	}

}
