package com.lab.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.net.*;
import java.io.*;

import java.util.regex.Pattern;

//new
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import com.lab.model.Interpreter;
import org.springframework.stereotype.Repository;

@Repository("interpreterDAO")
public class InterpreterDAO {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public InterpreterDAO(){
		super();
	}
	
	public Interpreter getTextTranslated(String sl, String tl, String st){

		
		log.info("*****************************************************");
		log.info("Dentro del DAO se crea el objeto Interpreter   ");
		log.info("*****************************************************");
		
		
		
		
		    log.debug("This is a debug message");
			log.info("This is an info message");
			log.warn("This is a warn message");
			log.error("This is an error message");
				
		Interpreter interpreter = new Interpreter();
		
		if(st != null && !st.isEmpty()){
			
			if(sl.equals("en") && tl.equals("es")){
				interpreter.setSourceLanguage(sl);
				interpreter.setTargetLanguage(tl);
				interpreter.setSourcetext(st);
				interpreter.setTranslatedText(translatorExt(sl,tl,st));
			}else if(sl.equals("es") && tl.equals("en") ){
				interpreter.setSourceLanguage(sl);
				interpreter.setTargetLanguage(tl);
				interpreter.setSourcetext(st);
				interpreter.setTranslatedText(translatorExt(sl,tl,st));
			}else{
				interpreter.setSourceLanguage("en");
				interpreter.setTargetLanguage("es");
				interpreter.setSourcetext(st);
				interpreter.setTranslatedText(translatorExt("en","es",st));
			}
		}
		
		
		//interpreter.setTranslatedText(translatorExt(sl,tl,st));
		return interpreter;	
		}

	private String translatorExt(String sl, String tl, String st){
		
		//Meter el contenido de TransService.java
		String inputLine = "";
		String translated = "";
		String finalTranslation = "";
		System.out.println("getTextTranslated");
		//call class with google api
		if(st != null && !st.isEmpty()){
			//https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=es&dt=t&dt=bd&dt=md&dt=ss&q=Window
			//String urlbase = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=es&dt=t&dt=bd&dt=md&dt=ss&q=Window";
			
			//vtranslated = getResponseFromHttpUrl(URL).toString();
			
			try{
				
				String sourceLang = sl;
				String targetLang = tl;
				String msg = st;
				//JSONParser parser = new JSONParser();
				String outputtranslator = "";
				
				//El formato de consulta bueno
				//https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=es&dt=t&dt=bd&q=gate&ie=UTF-8&oe=UTF-8&dj=1&source=icon&tk=467103.467103
				
				msg = URLEncoder.encode(msg, "UTF-8");
				URL url = new URL("http://translate.googleapis.com/translate_a/single?client=gtx&sl=" + sourceLang + "&tl="
				+ targetLang + "&dt=t"  + "&dt=bd"  + "&dj=1&source=icon" +    "&q="  + msg + "&ie=UTF-8&oe=UTF-8");
				//+ "&dt=bd&dt=ss&dt=ex"

				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println(url);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


				URLConnection uc = url.openConnection();
				uc.setRequestProperty("User-Agent", "Mozilla/5.0"); 
				
				//new
				StringBuilder sb = new StringBuilder();

				BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(), "UTF-8"));

				

				while ((inputLine = in.readLine()) != null) {
					translated = translated + inputLine;
					sb.append(inputLine);
					
					
				}
				//new
				
				JSONObject json = (JSONObject) new JSONParser().parse(translated);
				System.out.println("\n");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");
				System.out.println(json.get("sentences").toString());
				System.out.println(json.get("dict").toString());

				ArrayList<String> list = (ArrayList<String>)json.get("sentences");
				ArrayList<String> list2 = (ArrayList<String>)json.get("dict");
				System.out.println("\n");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");
				System.out.println("\n");
				System.out.println("Contenido list: " + list);
				System.out.println("Contenido list2: " + list2);
				

				

				System.out.println("Valor de translated: " + translated);
					
				String aresult[] = translated.split(",");	
		
				
				System.out.println("ESP: " + aresult[0].replace("\"","").replace("[",""));
				System.out.println("ENG: " + aresult[1].replace("\"",""));
			
				
				
				finalTranslation = aresult[0].replace("\"","").replace("[","");
					
				
				in.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}   catch (ParseException e) {
            e.printStackTrace();
        }   
    
			
			
			System.out.println("Text translated");
			//return "Text translated " + translated;
			return "Text translated: " + finalTranslation;
			
			
		}else{
			System.out.println("Nothing to translation");
			return "Nothing to translation";
		}
  	
	}//cierra el translatorExt
} //cierra la clase