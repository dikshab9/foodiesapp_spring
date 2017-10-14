package com.stackroute.foodiesapp.service;

import java.util.List;

import com.stackroute.foodiesapp.domain.FoodiesModel;



public interface FoodiesService {
	public List<FoodiesModel> getAllRestaurant( );
	public  FoodiesModel addRestaurant(FoodiesModel foodiesmodel);
	public boolean delete(String id);
	   
	   
}
