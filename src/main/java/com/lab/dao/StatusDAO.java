package com.lab.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.lab.model.Status;
import org.springframework.stereotype.Repository;

@Repository("statusDAO")
public class StatusDAO {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public Status getStatus(){
	
		log.info("*****************************************************");
		log.info("Dentro del DAO se crea el objeto status   ");
		log.info("*****************************************************");
		
		Status status = new Status(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"), LocalDateTime.now());
		
		    log.debug("This is a debug message");
			log.info("This is an info message");
			log.warn("This is a warn message");
			log.error("This is an error message");

		return status;	
		}
}
