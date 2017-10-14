package com.stackroute.foodiesapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document(collection="foodiesdb")
public class FoodiesModel {
	
	private String RestaurantName;
	private String cost;
	private String location;
	@Id
	private String id;
	
	
//	@Autowired
//	public FoodiesModel(String restaurantName, long cost, String location, String rest_id) {
//		super();
//		RestaurantName = restaurantName;
//		this.cost = cost;
//		this.location = location;
//		this.rest_id = rest_id;
//	}
//	public FoodiesModel()
//	
//	{}
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getid() {
		return id;
	}
	public void setRest_id(String id) {
		this.id = id;
	}
	
	//public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		
	}
	


