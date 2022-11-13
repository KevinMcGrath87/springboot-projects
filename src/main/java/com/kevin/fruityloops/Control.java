package com.kevin.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi",12.99));
		fruits.add(new Item("Mango",6.99));
		fruits.add(new Item("Goji Berry",112.99));
		fruits.add(new Item("Guava",6678.99));
		fruits.add(new Item("Orange", 0.03));
		fruits.add(new Item("Peach", 1.45));
		model.addAttribute("fruits", fruits);
		
		
		return "index.jsp";

		
	}

}
