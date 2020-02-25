package com.prueba.apirest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RSPruebaApplication {
	
	private final static Logger log = LoggerFactory.getLogger(RSPruebaApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(RSPruebaApplication.class, args);
		
		/*
		log.info("INFO - Application Start Running...");
	    log.debug("DEBUG - Application Start Running...");
	    log.error("ERROR - Application Start Running...");
	    log.warn("WARN - Application Start Running...");
	    
	    try {
	    	log.warn(InetAddress.getLocalHost().getHostAddress());
	    	log.warn(InetAddress.getLoopbackAddress().getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
        
	}

}
