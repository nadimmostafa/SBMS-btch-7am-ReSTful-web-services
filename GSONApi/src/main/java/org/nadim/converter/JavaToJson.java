package org.nadim.converter;

import java.io.File;
import java.lang.reflect.Type;

import org.nadim.entity.Employee;

import com.google.gson.Gson;

public class JavaToJson {
	public static void main(String[] args) {
		Employee emp = new Employee(101,"Sadia",45000.0);

		Gson gson = new Gson();
		String json = gson.toJson(emp);
		System.out.println(json);
		
		Employee emp2 = gson.fromJson(json, Employee.class);
		System.out.println(emp2);
	}

}
