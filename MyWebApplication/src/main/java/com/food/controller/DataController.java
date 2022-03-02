package com.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entities.Product;
import com.food.repository.ProductRepository;

@RestController
public class DataController {

	@GetMapping("/hi")
	public String hello() {
		return "hi";
	}
	
//	@Autowired
//	private ProductRepository product_Repo;
//
//	public String setProducts(List<Product> products) {
//		product_Repo.save(products);
//		return "";
//	}

}
