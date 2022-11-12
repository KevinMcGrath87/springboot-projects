package com.kevin.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/daikichi")
public class Controller {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Welcome, are you ready to hear your fortune? Type in \"today\" or \"tomorrow\" to see it. You may also enter \"travel\\city\" to see if you will get to travel to your dream destination!";
		
	}
	
	@RequestMapping(value = "/today", method = RequestMethod.GET)
	public String fortune(@RequestParam(value = "n", required = false) String name) {
		if (name == null) {
			name = "";
		}
		return String.format("YOU WILL DIE!!! eventually %s.",name);
	}
		
	@RequestMapping(value = "/tomorrow", method = RequestMethod.GET)
	public String fortune2(@RequestParam(value ="n", required = false)String name) {
		if (name == null) {
			name = "";
		}
		return String.format("Tomorrow you might...DIE!!. %s", name);
	}
	@RequestMapping(value = "travel/{city}", method = RequestMethod.GET)
	public String travelFortune(@PathVariable("city")String city) {
		return String.format("you will never ever get to go to %s", city);
		
	}
	@RequestMapping(value = "lotto/{number}")
	public String lotto(@PathVariable("number")String number) {
		if(number == null) {
			return "please enter an integer to determine your FATE!";
		}
		if (Integer.valueOf(number) % 2==0) {
			return "You will die a HORRIBLE DEATH!";
		}
		else {
			return "You will die a VERY HORRIBLE DEATH!";
		}
	}
	

}
