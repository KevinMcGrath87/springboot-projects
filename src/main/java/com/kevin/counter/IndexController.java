package com.kevin.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/your_server")
public class IndexController {
    @RequestMapping("/")
    public String index(HttpSession session, Model model) {
    	session.setAttribute("fromWelcome",true);
    	
    	if(session.getAttribute("count")==null) {
    		session.setAttribute("count",1);
    		return "welcome.jsp";
    	}
    	else {
    		Integer count = (Integer) session.getAttribute("count");
    		count = count + 1;
    		session.setAttribute("count", count);
    		return "welcome.jsp";
    		
    	}
    
    }
    @RequestMapping("/counter")
    	public String counter(Model model, HttpSession session){
    	boolean from = (boolean) session.getAttribute("fromWelcome");
    	if(from == true) {
        	Integer count = (Integer) session.getAttribute("count");
        	model.addAttribute("count", count);
        	from = false;
        	session.setAttribute("fromWelcome", from);
        	return "counter.jsp";
    		
    	}
    	else {
    	Integer count = (Integer) session.getAttribute("count");
    	count = count + 1;
    	session.setAttribute("count", count);
    	model.addAttribute("count", count);
    	from = false;
      	session.setAttribute("fromWelcome", from);
    	return "counter.jsp";
    	
    }
    //...
   

}
}
