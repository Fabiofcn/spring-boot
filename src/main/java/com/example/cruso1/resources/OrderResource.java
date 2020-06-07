package com.example.cruso1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruso1.entities.Order;
import com.example.cruso1.services.OrderService;

//import antlr.collections.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	/*@GetMapping
	public ResponseEntity<Order> findAll() {
		Order u = new Order(1L, "Maria","Marioa@gmail", "9999","1234");
		 
		return ResponseEntity.ok().body(u);
	}*/	
	
	
	@Autowired
	private OrderService service;
	
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
}