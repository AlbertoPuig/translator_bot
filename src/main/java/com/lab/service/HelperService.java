package com.lab.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lab.model.Helper;
import com.lab.dao.HelperDAO;

@Service("helperService")
public class HelperService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	HelperDAO helperDAO;
	public String getHelp(){
		log.info("*****************************************************");
		log.info("Dentro del Servicio Help se llama al DAO   ");
		log.info("*****************************************************");
		
		Helper help = helperDAO.getHelp();
		
		return help.getHelp();
	}




}