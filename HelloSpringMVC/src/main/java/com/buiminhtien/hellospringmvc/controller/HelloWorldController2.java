package com.buiminhtien.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController2 {

	String message="Wecome";
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value="name",required=false,defaultValue="World") String name) {
		System.out.println("in controller");
		ModelAndView mv=new ModelAndView("hello");
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
	}

}
