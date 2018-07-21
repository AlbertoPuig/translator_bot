package com.lab.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lab.service.StatusService;
import com.lab.service.HelperService;
import com.lab.service.InterpreterService;

@RestController
public class AppController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
    
	@Autowired
	InterpreterService interpreterService;
    @RequestMapping("/translate")
    public String translator(@RequestParam(value = "text", required = true) String text, @RequestParam(value = "sl", defaultValue = "na", required = false) String sl, @RequestParam(value = "tl", defaultValue = "na", required = false) String tl) 
		{
		log.info("*****************************************************");
		log.info("SourceLanguage " + sl + " -- " + "TargetLanguage " + tl);
		log.info("*****************************************************");
		return interpreterService.getTextTranslated(sl,tl,text);	
    }
	
	@Autowired
	HelperService helperService;
	@RequestMapping("/help")
	public String help(){
		return helperService.getHelp();
	}
	
	@Autowired
	StatusService statusService;
	@RequestMapping("/status")
	public String status(){
		return statusService.getStatus().toString();
	}
		
}