package com.stackroute.foodiesapp.repository;

import com.stackroute.foodiesapp.domain.FoodiesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FoodieRdbmsRepository extends CrudRepository<FoodiesModel,String>{

}
