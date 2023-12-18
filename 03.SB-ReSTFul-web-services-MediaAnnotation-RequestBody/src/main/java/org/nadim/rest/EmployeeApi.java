package org.nadim.rest;

import java.util.List;

import org.nadim.entity.Address;
import org.nadim.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {
    
	// create employee
	// JSON to Java Object conversation
	@PostMapping("/create")
	public ResponseEntity<String> createEmp(@RequestBody Employee employee){
		String emp = employee.toString();
		ResponseEntity<String> response = new ResponseEntity<>(emp,HttpStatus.CREATED);
		return response;
	}
	
	//Java to JSON Convert
	@GetMapping("/get")
	public ResponseEntity<Employee> getAddress(){
		Employee employee = new Employee(101,"Nadim",45000.0,
				new Address("Section-B 30/2 road","Rajshahi",List.of("25488880","69335555")));
		ResponseEntity<Employee> response = new ResponseEntity<>(employee,HttpStatus.OK);
		return response;
	}
}
