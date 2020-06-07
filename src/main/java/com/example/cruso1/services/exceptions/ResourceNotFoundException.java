package com.example.cruso1.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super ("Recurso n�o encontrado - Resource not found. id "+ id);
	}
}
