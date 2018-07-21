package com.lab.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Status {

		DateTimeFormatter dtf;
		LocalDateTime now;
		
		private final Logger log = LoggerFactory.getLogger(this.getClass());
		
		public Status(DateTimeFormatter dtf, LocalDateTime now){
			super();
			this.dtf = dtf;
			this.now = now;
			
		}
		public String getStatus(){
		
		    log.debug("This is a debug message");
			log.info("This is an info message");
			log.warn("This is a warn message");
			log.error("This is an error message");
			log.info("*****************************************************");
			log.info("Valor de status dentro del bean en getStatus" + this.dtf.format(this.now) );
			log.info("*****************************************************");

		return this.dtf.format(this.now);	
		}
}