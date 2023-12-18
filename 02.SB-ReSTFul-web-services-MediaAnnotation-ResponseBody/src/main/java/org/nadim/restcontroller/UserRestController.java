package org.nadim.restcontroller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.nadim.model.Employee;
import org.nadim.model.Product;
import org.nadim.model.User;
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
	public ResponseEntity<UserRole> getEmployee() {
		UserRole role = new UserRole(101, "Admin");
		ResponseEntity<UserRole> response = new ResponseEntity<>(role, HttpStatus.OK);
		return response;
	}

	// Type-2 : List/array/set data as JSON format
	@GetMapping("/list")
	public ResponseEntity<Employee> getListData() {
		String[] gender = { "Male", "Female" };
		Employee employee = new Employee(101, "Nadim", "Chapainawabgonj", gender);
		ResponseEntity<Employee> response = new ResponseEntity<>(employee, HttpStatus.OK);
		return response;
	}

	// Type-3 : List of Object to JSON Format
	@GetMapping("/objList")
	public ResponseEntity<List<User>> getUserList() {
		List<User> list = Arrays.asList(
					new User(101,"Nadim","nadim26@gmail.com",new UserRole(011,"Admin")),
					new User(102,"Asif","asif56@gmail.com",new UserRole(012,"Root")),
					new User(103,"Shuvo","Shuvo43@gmail.com",new UserRole(013,"User"))
				);
		ResponseEntity<List<User>> response = new ResponseEntity<>(list,HttpStatus.OK);
		return response;
	}
	
	//Type-04 : Map to JSON format
	@GetMapping("/map")
	public ResponseEntity<Product> getMap(){
		Product product = new Product(101,"Laptop",45000.0,Map.of("p1","Dell 54ips","p2","Ideapad 320"));
		ResponseEntity<Product> response = new ResponseEntity<>(product,HttpStatus.OK);
		return response;
	}
	
}
