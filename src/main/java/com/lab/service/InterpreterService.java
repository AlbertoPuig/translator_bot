package com.lab.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lab.model.Interpreter;
import com.lab.dao.InterpreterDAO;

@Service("interpreterService")
public class InterpreterService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	InterpreterDAO interpreterDAO;
	public String getTextTranslated(String sl, String tl, String st){
		log.info("*****************************************************");
		log.info("Dentro del Servicio translated se llama al DAO   ");
		log.info("*****************************************************");
		
		Interpreter interpreter = interpreterDAO.getTextTranslated(sl,tl,st);
		
	
		return interpreter.getTranslatedtext();
	}
}