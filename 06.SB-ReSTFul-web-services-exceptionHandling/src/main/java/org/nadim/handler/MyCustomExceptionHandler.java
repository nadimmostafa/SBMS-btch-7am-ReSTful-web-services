package org.nadim.handler;

import java.util.Date;

import org.nadim.bean.CustomExceptionResponse;
import org.nadim.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyCustomExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<CustomExceptionResponse> getExceptionMessage(ProductNotFoundException pnfe){
		CustomExceptionResponse cer = new CustomExceptionResponse(
				500,"Exception In process", new Date().toString(), pnfe.getMessage()
				);
		ResponseEntity<CustomExceptionResponse> response = new ResponseEntity<>(cer,HttpStatus.OK);
		return response;
	}
}
