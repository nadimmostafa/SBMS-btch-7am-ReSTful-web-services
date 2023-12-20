package org.nadim.service;

import org.nadim.entity.Product;
import org.nadim.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public Product findProduct(Integer id) {
		
		Product pdt = null;
		if(id == 101) {
			pdt = new Product(101,"Laptop",25600.0);
		}else {
			throw new ProductNotFoundException("Product "+id+" not found");
		}
		return pdt;
	}
}
