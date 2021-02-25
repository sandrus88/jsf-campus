package org.sg.campus.domain;

public enum PaymentType {
	OK("Pagamento effettuato"), 
	NOTOK("Pagamento non effettuato "), 
	UNKNOWN("Da verificare");

	private String label;

	private PaymentType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
