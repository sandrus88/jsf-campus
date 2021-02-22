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
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public String getSex() {
		return sex;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id: " + id + ", name: " + name + ", surname: " + surname + ", job title: " + jobTitle + ", payment type: " + paymentType + ", sex: " + sex + "]";
	}
}
