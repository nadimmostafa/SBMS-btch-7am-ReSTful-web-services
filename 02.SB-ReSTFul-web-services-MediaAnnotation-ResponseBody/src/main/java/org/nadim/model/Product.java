package org.nadim.model;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private Integer pId;
	private String pName;
	private Double pPrice;
	
	private Map<String,String> models;
}
