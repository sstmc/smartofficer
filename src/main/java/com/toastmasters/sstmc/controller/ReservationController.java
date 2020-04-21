package com.toastmasters.sstmc.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toastmasters.sstmc.entities.Reservation;
import com.toastmasters.sstmc.service.ReservationService;

@RestController()
@RequestMapping("/reservations")
public class ReservationController {

	@Autowired
    private ReservationService reservationService;
    
    @RequestMapping(method=RequestMethod.POST)
    public boolean add(@RequestBody Reservation reservation)
    {
        return reservationService.add(reservation);
    }
    
    @RequestMapping(method=RequestMethod.DELETE)
    public boolean deleteAll()
    {
        return reservationService.deleteAll();
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Reservation> list()
    {
        return reservationService.list();
    }
    
    @RequestMapping(method=RequestMethod.GET, params="date")
    public List<Reservation> getByDate(@RequestParam Date date)
    {
        return reservationService.getByDate(date);
    }
}
