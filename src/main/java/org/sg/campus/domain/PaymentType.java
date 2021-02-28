package org.sg.campus.domain;

public enum PaymentType {
	OK("Confirmed"), 
	NOTOK("Not confirmed"), 
	UNKNOWN("To be confirmed");

	private String label;

	private PaymentType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
