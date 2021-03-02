package org.sg.campus.domain;

public class PaymentTypeDropDown {
	private PaymentType id;// serve un dropdow con 3 campi ok, notok e unknown
	private String label;// label che si fa vedere in output e lo prenderei da message protperties.
	
	public PaymentType getId() {
		return id;
	}
	public void setId(PaymentType id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
