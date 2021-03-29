package com.ibm.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.Services.OrderService;

@RestController

public class UserController {
	Logger logger = Logger.getLogger(UserController.class.getName());
	@Autowired
	OrderService orderservice;
	@GetMapping("/hello")
	void hello1() {
		logger.setLevel(Level.WARNING);
		logger.log(Level.WARNING, "Marjaneya");
		//return "Hello from the yes side";
	}
	
}
