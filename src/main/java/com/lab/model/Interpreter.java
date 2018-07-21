package com.lab.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Interpreter {

	private String sourcelanguage;
	private String targetlanguage;
	private String sourcetext;
	private String translatedtext;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public Interpreter(){
		super();
	}
	
	public Interpreter(String sl,String tl,String st){
		super();
		this.sourcelanguage = sl;
		this.targetlanguage = tl;
		this.sourcetext = st;
	
	
	}
	
	public void setTranslatedText(String tl){
		this.translatedtext = tl;
	}

	public String getSourcelanguage(){
		return this.sourcelanguage;
	}

	public String getTargetlanguage(){
		return this.targetlanguage;
	}

	public String getSourcetext(){
		return this.sourcetext;
	}

	public String getTranslatedtext(){
		return this.translatedtext;
	}
	
	public void setSourceLanguage(String sl){
		this.sourcelanguage = sl;
		
	}
	
	public void setTargetLanguage(String tl){
		this.targetlanguage = tl;
		
	}
	
	public void setSourcetext(String st){
		this.sourcetext = st;
		
	}


}
