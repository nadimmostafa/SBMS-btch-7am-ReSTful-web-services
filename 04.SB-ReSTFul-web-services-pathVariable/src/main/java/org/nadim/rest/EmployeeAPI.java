package org.nadim.rest;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.nadim.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/employee")
public class EmployeeAPI {
	Map<Integer,Employee> mp = new HashMap<>();
	
	// 1. save data
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<String> createEmp(@RequestBody Employee emp){
		mp.put(emp.getEmpId(), emp);
		ResponseEntity<String> response = 
				new ResponseEntity<String>("Employee " + emp.getEmpId() + " Created",HttpStatus.CREATED);
		return response;
	}
	
	//PathVariable
	// http://localhost:9191/employee/get/101
	@GetMapping("/get/{empId}")
	public ResponseEntity<Employee> getEmp(@PathVariable("empId") Integer id){
		Employee employee = mp.get(id);
		ResponseEntity<Employee> response = 
				new ResponseEntity<Employee>(employee,HttpStatus.OK);
		return response;
	}
	
	//RequestParam
	// http://localhost:9191/employee/get?empId=101
	@GetMapping("/get")
	public ResponseEntity<Employee> getEmpA(@RequestParam("empId") Integer id){
		Employee employee = mp.get(id);
		ResponseEntity<Employee> response = 
				new ResponseEntity<Employee>(employee,HttpStatus.OK);
		return response;
	}
	
	
	//show Request Header data
	@GetMapping("/header")
	public ResponseEntity<String> getHeaderData(
			@RequestHeader("Content-Type") String msg,
			@RequestHeader("Content-Length") String ln,
			HttpServletRequest req
			){
		
		Enumeration<String> headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String names = headerNames.nextElement();
			System.out.println(names +": "+req.getHeader(names));
			
		}
		String message ="Content-Type: "+ msg + ", Content-Length: " +ln;
		ResponseEntity<String> response = new ResponseEntity<>(message,HttpStatus.OK);
		return response;
	}
}
