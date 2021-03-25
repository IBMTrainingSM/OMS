package com.ibm.demo.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Order {
	@NotNull
	@NotBlank
	private String item;
	@NotNull
	private float price;
	private int id;

	public String getItem() {
		return item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		if(id<=0)
		{
			throw new IllegalArgumentException("OrderID cannot be Negative");
		}
		this.id = id;
		
	}

	public void setItem(String item) {
		
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if(price<=0)
		{
			throw new IllegalArgumentException("Price cannot be Negative");
		}
		this.price = price;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}
