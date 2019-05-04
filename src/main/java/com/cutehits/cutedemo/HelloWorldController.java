package com.cutehits.cutedemo;
import java.util.logging.LogManager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class HelloWorldController {

	//public static final Logger log = LoggerFactory.getLogger(Resource.class);
	
	//private static final Logger LOGGER = LogManager.getLogger(TheClass.class);
	
	protected static final Logger log = LoggerFactory
			.getLogger(Resource.class);
	
	@RequestMapping("/helloworld")
	public String  HelloWorld()
	{
		log.info("created a new item named  identifier");
		log.error("created a new item named  identifier");
        log.warn("created a new item named  identifier");
		return "Hello World";
	}
	
	/*@RequestMapping("/error")
	String logger() {
		
		log.info("created a new item named  identifier");
		log.error("created a new item named  identifier");
        log.warn("created a new item named  identifier");

        System.out.println("Test");
       
        return "Logger Called.";

    }*/

}
