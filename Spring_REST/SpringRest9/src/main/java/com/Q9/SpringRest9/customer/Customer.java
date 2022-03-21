package com.Q9.SpringRest9.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
    private  int id;
    private  String name;
    private  String email;
    private  String address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
