package org.sg.campus.domain;

public class PaymentTypeSelectOneMenu {
	private PaymentType id;
	private String label;
	
	public PaymentTypeSelectOneMenu(PaymentType id, String label) {
		this.id = id;
		this.label = label;
	}
	
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
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id: " + id + ", label: " + label + " ]";
	}
}
