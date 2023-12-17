package org.nadim.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer empId;
	private String empName;
	private String empAddress;
	
	// List/Array/Set Data representation in JSON format
	//private List<String> gender;
	private String [] gender;
}
