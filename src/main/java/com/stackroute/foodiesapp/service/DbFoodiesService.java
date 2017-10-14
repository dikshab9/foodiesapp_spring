package com.stackroute.foodiesapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.foodiesapp.domain.FoodiesModel;
import com.stackroute.foodiesapp.repository.FoodieRdbmsRepository;
@Service
public class DbFoodiesService implements FoodiesService {
	@Autowired
	FoodieRdbmsRepository foodieRdbmsRepository; 
   
	   public List<FoodiesModel> getAllRestaurant( )
	   {
		   return (List)foodieRdbmsRepository.findAll();
	   }
	   

	   public  FoodiesModel addRestaurant(FoodiesModel foodiesmodel)
	   {
	      foodieRdbmsRepository.save(foodiesmodel);
	      return foodiesmodel;
	   }
	   
	  
	   public boolean delete(String id)
       {
		   foodieRdbmsRepository.delete(id);
		   //System.out.println("delete is running..");
		   return true;
       }

	
		
	

}
