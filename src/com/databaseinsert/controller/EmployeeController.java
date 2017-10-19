package com.databaseinsert.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.databaseinsert.model.Employee;
import com.databaseinsert.service.EmployeeService;

import org.springframework.ui.ModelMap;

@Controller
public class EmployeeController {
	
	private static final Logger logger = Logger
            .getLogger(EmployeeController.class);
 
    public EmployeeController() {
        System.out.println("EmployeeController()");
    }

	@Autowired
	public EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public ModelAndView employee() {
        System.out.println("---dentro controller---");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Register form **********</h3></div><br><br>";
		return new ModelAndView("employee", "message", message);
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
	    mav.addObject("employee", new Employee());
	    return mav;
	}
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addEmployee(HttpServletRequest request, HttpServletResponse response,
	@ModelAttribute("employee") Employee employee) {
		employeeService.register(employee);
		return new ModelAndView("result", "emp", new Object[] { employee.getAge(), employee.getFirst(),
			    employee.getLast() });
	}
	@RequestMapping("/result")
	public ModelAndView result() {
        System.out.println("---dentro controller---");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Result of the registration **********</h3></div><br><br>";
		return new ModelAndView("result", "message", message);
	}
}