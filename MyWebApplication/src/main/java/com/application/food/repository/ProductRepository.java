package com.application.food.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.food.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	

}
 