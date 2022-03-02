package com.food.repository;


import org.springframework.data.repository.CrudRepository;

import com.food.entities.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	

}
 