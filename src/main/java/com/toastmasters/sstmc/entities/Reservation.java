package com.toastmasters.sstmc.entities;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@SuppressWarnings("serial")
public class Reservation implements Serializable {

	Date date;
	String name;
	String role;
	String club;
}
