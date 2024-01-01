package org.nadim.rest;

import java.util.Arrays;
import java.util.List;

import org.nadim.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/product")
public class ProductRestController {
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
}
