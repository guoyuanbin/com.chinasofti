package com.chinasofti.EUser.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Handler {
	@RequestMapping(value="/login",method=RequestMethod.PUT)
	public ModelAndView login(@RequestParam(value="username") String username,
			@RequestParam(value="password") String password)
	{
		ModelAndView modelAndView=new ModelAndView("showInfo");
				return null;
	}
	@RequestMapping(value="/tiaozhuan",method=RequestMethod.GET)
	public String tiaozhuan(){
		return "showInfo";
	}
	
}
