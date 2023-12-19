package org.nadim.rest;

import org.nadim.entity.Book;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookAPI {
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getBook(@PathVariable("id") Integer bookId){
		
		Book book = new Book(101,"Java",2500.0);
		HttpHeaders header = new HttpHeaders();
		
		ResponseEntity<?> response = null;
		
		if(bookId==book.getBookId()) {
			header.add("Found", "Yes");
			response = new ResponseEntity<Book>(book,header,HttpStatus.OK);
		}
		else {
			header.add("Found", "No");
			response = new ResponseEntity<String>(
					"Sorry No Book found",header,HttpStatus.BAD_REQUEST);
		}
		
		return response;
	}

	@GetMapping("/show")
	public ResponseEntity<String> showResponseInfo(){
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type","application/json");
		
		//1. Passing HttpStatus
		//ResponseEntity<String> response = new ResponseEntity<>(HttpStatus.OK);
		
		//2. Passing Body with HttpStatus
		//ResponseEntity<String> response = new ResponseEntity<>("Body With StatusCode",HttpStatus.OK);
		
		//3. Passing Headers with HttpStaus
		
		//ResponseEntity<String> response = new ResponseEntity<>(header,HttpStatus.OK);
		
		//4. Passing Body,Headers with HttpStatus
		ResponseEntity<String> response = new ResponseEntity<>("Body,Headers With StatusCode",header,HttpStatus.OK);
		return response;
	}

}
