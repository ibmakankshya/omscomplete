package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderSearchController {
	@Autowired // is used for DI
	OrderService orderService; // DI
	
	@GetMapping("/order")
	List<Order> getOrders(){
		return orderService.getOrders();
	}
	@GetMapping("/order/{id}")
	Optional<Order> getOrder(@RequestBody @PathVariable("id") String orderID) {
		System.out.println("DEV Calling!");
		return orderService.getOrder(orderID);
	}
}
