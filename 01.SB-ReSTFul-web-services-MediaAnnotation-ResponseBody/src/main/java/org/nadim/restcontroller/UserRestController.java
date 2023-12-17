package org.nadim.restcontroller;

import java.util.Arrays;

import org.nadim.model.Employee;
import org.nadim.model.UserRole;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	// Type-1: get normal Object as response
	@GetMapping("/getObj")
	public ResponseEntity<UserRole> getEmployee(){
		UserRole role = new UserRole(101,"Admin");
		ResponseEntity<UserRole> response = new ResponseEntity<>(role,HttpStatus.OK);
		return response;
	}
	
	// Type-2 : List/array/set data as JSON format
	@GetMapping("/list")
	public ResponseEntity<Employee> getListData(){
		String [] gender = {"Male","Female"};
		Employee employee = new Employee(101,"Nadim","Chapainawabgonj",gender);
		ResponseEntity<Employee> response = new ResponseEntity<>(employee,HttpStatus.OK);
		return response;
	}
}
