package org.sg.campus.domain;

public enum PaymentType {
	OK("pagamento effettuato"), 
	NOTOK("pagamento non effettuato "), 
	UNKNOWN("da verificare");

	private String label;

	private PaymentType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
