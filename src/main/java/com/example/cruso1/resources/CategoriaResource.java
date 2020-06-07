package com.example.cruso1.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categoriasss")
public class CategoriaResource {
	//Procurar cruso de REST
	//Para reconhecer um metodo fora do CRUD
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest -  esta funcionado!";
	}

}
