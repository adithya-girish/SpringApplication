package com.food.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@GetMapping("/hi")
	public String hello() {
		return "hi";
	}

	@RequestMapping("/getItems")
	public Map<String, String> getItems() {

//		return Arrays.asList(new Food("1", "Crispy Corn", "Starter"), new Food("2", "Biryani", "Main Course"),
//				new Food("3", "Brownie", "Desert"), new Food("4", "Fried Rice", "Main Course"));
		Map<String, String> map = new HashMap<>();

		List<String> keys = Arrays.asList("Crispy Corn", "Biryani", "Brownie");
		List<String> values = Arrays.asList("Starter", "Main Course", "Desert");

		for (int i = 0; i < keys.size(); i++) {
			map.put(keys.get(i), values.get(i));
		}
		
		return map;

	}

}
