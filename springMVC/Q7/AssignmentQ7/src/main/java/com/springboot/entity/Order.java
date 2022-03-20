package com.springboot.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {

	private int id;
	private String name;
	private String quantity;
	private String price;
	private String payment;

	public Order() {
		super();
	}

	public Order(int id, String name, String quantity, String price, String payment) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.payment = payment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", payment="
				+ payment + "]";
	}

}
