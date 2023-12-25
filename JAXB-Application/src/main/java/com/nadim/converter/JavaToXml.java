package com.nadim.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nadim.Customer;

public class JavaToXml {
	public static void main(String[] args) throws JAXBException {
		Customer c = new Customer();
		c.setName("Nadim Mostafa");
		c.setId(15);
		c.setGender("Male");
		c.setPhn(182938l);
		
		JAXBContext jaxb = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = jaxb.createMarshaller();
		marshaller.marshal(c, new File("customer.xml"));
		
	}
}
