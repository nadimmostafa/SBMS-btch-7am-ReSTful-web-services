package org.nadim.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private String houseNo;
	private String location;
	
	private List<String> contactNumber;
}
