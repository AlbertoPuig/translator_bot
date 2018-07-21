package com.lab.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lab.model.Status;
import com.lab.dao.StatusDAO;


@Service("statusService")
public class StatusService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StatusDAO statusDAO;
	public String getStatus(){
		log.info("*****************************************************");
		log.info("Dentro del Servicio se llama al DAO   ");
		log.info("*****************************************************");
		
		Status status = statusDAO.getStatus();
		return status.getStatus();
	}




}