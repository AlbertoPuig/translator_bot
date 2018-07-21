package com.lab.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Helper{

	private final String helpmessage;
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public Helper(){
		super();
		this.helpmessage = "First, choose your From and To languages. Available: From EN (English) to ES (Spanish) and vice versa. \n Then, type your text—up to 160 characters each time";
	
	}
	
	public String getHelp(){
		    log.debug("This is a debug message");
			log.info("This is an info message");
			log.warn("This is a warn message");
			log.error("This is an error message");
			log.info("*****************************************************");
			log.info("Valor de status dentro del bean Help en getHelp");
			log.info("*****************************************************");
		return this.helpmessage;
	}

}