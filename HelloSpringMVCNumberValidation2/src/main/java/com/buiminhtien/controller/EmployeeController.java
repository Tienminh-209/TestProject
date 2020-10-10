package com.buiminhtien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buiminhtien.employee.Employee;

@Controller
public class EmployeeController {
@RequestMapping("/hello")
public String display(Model m) {
	m.addAttribute("emp", new Employee());
	return "viewpage";
}
@RequestMapping("/helloagain")
public String submitForm( @Validated @ModelAttribute("emp") Employee e, BindingResult br) {
	if(br.hasErrors()) {
		return "viewpage";
	}
	else {
		return "final";
	}
}
}

