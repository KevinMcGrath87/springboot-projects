package com.kevin.form;

import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class MainController {
	
	@RequestMapping("/form")
		public String welcome(){
			return "form.jsp";
		
	}
	
	
	@RequestMapping(value ="/fortuneTell", method = RequestMethod.POST)
	public String login(
			@RequestParam(value = "city")String city,
			@RequestParam(value ="person") String person,
			@RequestParam(value ="hobby") String hobby,
			@RequestParam(value ="compliment")String compliment,
			HttpSession session
			){
		
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("compliment", compliment);
		
		
		
		return "redirect:/omikuji/fortune";
		
	}
	@RequestMapping("/fortune")
	public String fortune (HttpSession session, Model model) {
		String city = (String) session.getAttribute("city");
		String person =(String) session.getAttribute("person");
		String hobby = (String) session.getAttribute("hobby");
		String compliment = (String) session.getAttribute("compliment");
		
		model.addAttribute("city",city);
		model.addAttribute("person",person);
		model.addAttribute("hobby",hobby);
		model.addAttribute("complment",compliment);
		
		return"fortune.jsp";
		
	}
}
