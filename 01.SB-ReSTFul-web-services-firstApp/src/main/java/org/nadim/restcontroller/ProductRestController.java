package org.nadim.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	// 1.fetching data
	@GetMapping("/fetch")
	public ResponseEntity<String> fetchingProduct(){
		ResponseEntity<String> response = new ResponseEntity<>("From GET Method",HttpStatus.OK);
		return response;
	}
	
	// 2. save/create new resource
	@PostMapping("/save")
	public ResponseEntity<String> saveData(){
		ResponseEntity<String> response = new ResponseEntity<>("From POST Method",HttpStatus.CREATED); 
		return response;
	}
	
	// 3. Update resource
	@PutMapping("/update")
	public ResponseEntity<String> updateData(){
		ResponseEntity<String> response = new ResponseEntity<>("From PUT Method",HttpStatus.OK);
		return response;
	}
	
	// 4. Delete resource
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeData(){
		ResponseEntity<String> response = new ResponseEntity<>("From DELETE Method",HttpStatus.OK);
		return response;
	}
	
	// 5. Partial Update resource
	@PatchMapping("/partial")
	public ResponseEntity<String> updateProductCost(){
		ResponseEntity<String> response = new ResponseEntity<>("From PATCH Method",HttpStatus.OK);
		return response;
	}
}
