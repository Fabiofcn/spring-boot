package com.example.cruso1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruso1.entities.Category;
import com.example.cruso1.services.CategoryService;

//import antlr.collections.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	/*@GetMapping
	public ResponseEntity<Category> findAll() {
		Category u = new Category(1L, "Maria","Marioa@gmail", "9999","1234");
		 
		return ResponseEntity.ok().body(u);
	}*/	
	
	
	@Autowired
	private CategoryService service;
	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
}
