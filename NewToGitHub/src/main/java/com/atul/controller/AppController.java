package com.atul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atul.model.Employee;
import com.atul.service.EmployeeService;

@Controller
@RequestMapping("/")
public class AppController {
	@Autowired
	EmployeeService service;
	
	@Autowired
	MessageSource messageSource;
	
	//this method will list all existing employees.
	@RequestMapping(value = {"/","/list"} , method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {
		List<Employee> employees = service.findAllEmployees();
		
	}
	
}
