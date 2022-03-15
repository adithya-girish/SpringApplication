package com.application.food.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.food.models.Product;
import com.application.food.repository.ProductRepository;
import com.sipios.springsearch.anotation.SearchSpec;

@RestController

public class DataController {
	@Autowired
	private ProductRepository product_Repo;

	@GetMapping("/hi")
	public String hello() {
		return "hi";
	}

	@PostMapping("/setProducts")
	public String serProducts(@RequestBody List<Product> products) {
		product_Repo.saveAll(products);
		return "Updated Products: " + products.size();
	}

	@GetMapping("/getProducts")
	public List<Product> getTickets() {
		return (List<Product>) product_Repo.findAll();
	}

	@GetMapping("/getProductById/{id}")
	public Optional<Product> getProductById(@PathVariable("id") int id) {
		return product_Repo.findById(id);
	}

	@GetMapping("/search/{name}")
	public Optional<Product> searchByName(@SearchSpec Specification<Product> specs, @PathVariable("name") String name) {
		return null;
	}

}
