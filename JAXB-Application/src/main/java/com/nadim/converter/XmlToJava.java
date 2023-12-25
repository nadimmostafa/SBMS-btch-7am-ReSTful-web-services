package com.nadim.converter;

import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.nadim.Customer;

public class XmlToJava {
	public static void main(String [] args) throws JAXBException {
		
		File f = new File("customer.xml");
		
		JAXBContext jaxb = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = jaxb.createUnmarshaller();
		Object object = unmarshaller.unmarshal(f);
		Customer c = (Customer) object;
		System.out.println(c);
	}
}
