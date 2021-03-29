package com.ibm.demo.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Order {
	@NotNull
	@NotBlank //annotation for empty
	private String item;
	private int price;
	@Id
	private String ID;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<=0) {
		throw new IllegalArgumentException("Price is negative");
		}
		this.price = price;
	}

}
