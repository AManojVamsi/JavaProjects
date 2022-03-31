package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EproductExecptionController {
	
	@ExceptionHandler(value= ProductNotFound.class)
	public ResponseEntity<Object> exception (ProductNotFound exception){
		return new ResponseEntity<>("Product Not Found", HttpStatus.NOT_FOUND);
	}

}
