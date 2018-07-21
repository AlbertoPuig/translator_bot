package com.lab.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lab.model.Helper;
import org.springframework.stereotype.Repository;

@Repository("helperDAO")
public class HelperDAO {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public Helper getHelp(){
		log.info("*****************************************************");
		log.info("Dentro del DAO se crea el objeto status   ");
		log.info("*****************************************************");
		
		Helper help = new Helper();
		
		    log.debug("This is a debug message");
			log.info("This is an info message");
			log.warn("This is a warn message");
			log.error("This is an error message");

		return help;	
		}
}
