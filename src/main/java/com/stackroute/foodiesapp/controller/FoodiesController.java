package com.stackroute.foodiesapp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.foodiesapp.domain.FoodiesModel;
import com.stackroute.foodiesapp.service.DbFoodiesService;
import com.stackroute.foodiesapp.service.FoodiesService;

@RestController
@RequestMapping("/v0.1/FoodiesService")
public class FoodiesController {
	 private static final String template = "Hello!";
	 @Autowired
	 private FoodiesService foodiesservice;
	 private DbFoodiesService dbfoodiesservice;
	
	 /*Get req*/
 
	 @GetMapping("/FoodiesModel")
	 
	 public ResponseEntity getAllRestaurants( )
	   {
	      List<FoodiesModel> resultList1 = foodiesservice.getAllRestaurant();
	       
	       return new ResponseEntity<List<FoodiesModel>>(resultList1, HttpStatus.OK) ;
	   }
	 
	/*Post request*/
	
	  @PostMapping( value="/FoodiesModel", consumes="application/json")
	   public ResponseEntity addRestaurant(@RequestBody FoodiesModel foodiesmodel)
	   {
	       /*Add validation code*/        
		  foodiesservice.addRestaurant(foodiesmodel);
	       return new ResponseEntity<String>("created", HttpStatus.OK) ;
	       
	   }
	
	  @RequestMapping(method=RequestMethod.DELETE, value="/FoodiesModel/{id}", consumes="application/json")
	    public ResponseEntity<String> delete(@PathVariable(value="id") int id){
	    
	        /*Add validation code*/        
		  foodiesservice.delete(Integer.toString(id));
	      return new ResponseEntity<String>("Deleted succesfully", HttpStatus.OK) ;
	        
	    }
}
