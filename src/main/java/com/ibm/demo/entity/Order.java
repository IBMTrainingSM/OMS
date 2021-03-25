package com.ibm.demo.entity;

import javax.validation.constraints.NotNull;

public class Order {
	@NotNull
	private String item;
	private float price;
	private String name;

	public String getItem() {
		return item;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
