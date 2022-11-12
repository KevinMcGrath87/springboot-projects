package com.kevin.hellohuman;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value = "name", required = false)String name, @RequestParam(value = "last", required = false) String last,@RequestParam(value = "times",required = false)String numberOfTimes) {
		if (name == null) {
			name = "Human";
		}
		if (last == null ) {
			last = "";
		}
		if (numberOfTimes == null) {
		return String.format("Hello %s %s", name, last);
		}
		String concatenated = "";
		for(int i = 0; i < Integer.valueOf(numberOfTimes);i++) {
			concatenated = concatenated + (String.format("Hello %s %s", name, last))+ " ";
		}
		return concatenated;
		}
}
