package org.nadim.rest;

import org.nadim.entity.Product;
import org.nadim.exception.ProductNotFoundException;
import org.nadim.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductAPI {
	@Autowired
	private ProductService service;
	/*
	@GetMapping("/get/{id}")
	public ResponseEntity<String> findProductById(@PathVariable("id") Integer pId){
		ResponseEntity<String> response = null;
		if(pId==101) {
			response = new ResponseEntity<>("Product Exit",HttpStatus.OK);
		}else {
			throw new ProductNotFoundException("Product Not Found");
		}
		return response;
	}
	*/
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Integer pId){
		ResponseEntity<Product> response = null;
		
		try {
			Product product = service.findProduct(pId);
			response = new ResponseEntity<>(product,HttpStatus.OK);
			
		}catch(ProductNotFoundException pnfe) {
			pnfe.printStackTrace();
			throw pnfe;
		}
		
		return response;
	}
	
	
}
