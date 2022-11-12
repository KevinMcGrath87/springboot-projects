package com.kevin.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/daikichi")
public class Controller {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Welcome, are you ready to hear your fortune? Type in \"today\" or \"tomorrow\" to see it.";
		
	}
	
	@RequestMapping(value = "/today", method = RequestMethod.GET)
	public String fortune() {
		return "YOU WILL DIE!!! eventually.";
	}
		
	@RequestMapping(value = "/tomorrow", method = RequestMethod.GET)
	public String fortune2() {
		return "Tomorrow you might...DIE!!.";
	}

}
