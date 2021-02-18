package org.sg.domain;

public class Student {
	private int id;
	private String name;
	private String surname;
	private String jobTitle;
	private String paymentType;
	private String sex;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
