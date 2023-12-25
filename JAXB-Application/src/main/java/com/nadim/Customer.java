package com.nadim;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private Integer id;
	private String name;
	private String gender;
	private Long Phn;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getPhn() {
		return Phn;
	}

	public void setPhn(Long phn) {
		Phn = phn;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", Phn=" + Phn + "]";
	}
	
	
}
