package com.pack;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/userController")

public class userController {
@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(@ModelAttribute("add")User user ,Model model) {
	int i= Integer.parseInt(user.getId()) ;
	model.addAttribute("s", i+2);
		return "success";
	}


@ModelAttribute
public Model user(Model model) {
	model.addAttribute("headerinfo", "First MVC APP");
		return model;
	}
}
