package com.ibm.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;


@Service
public class OrderService {//spring beans classes with special annotation
	@Autowired     //dependency of repository class
	OrderRepository orderepository;
	@Autowired  
	RestTemplate getTaxesTemplate;
	public String createOrder(Order order) {
		//call get taxes
		
		Float response =getTaxesTemplate.getForObject("localhost:8080/get taxes?price={price}", Float.class, order.getPrice());
		System.out.println(response);
		Order savedOrder = orderepository.save(order) ;
		return savedOrder.getID();
		}
	//search all orders

	public List<Order> getOrders(){
		//return new ArrayList<Order>();
		return orderepository.findAll();
	}

	public void updateOrder(Order order) {
		orderepository.save(order);
		//return "Order is updated!";
	}
	public void deletedOrder(String orderID) {
		orderepository.deleteById(orderID);
		//return "Order is deleted!";
	}
	public Optional<Order> getOrder(String orderID) {

		return orderepository.findById(orderID);
	}
}
