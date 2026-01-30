package com.lambdaexpressions.invoiceobjectcreation;

public class Invoice {
	private String trnasactionId;

	public Invoice(String trnasactionId) {
		super();
		this.trnasactionId = trnasactionId;
	}

	public String getTrnasactionId() {
		return trnasactionId;
	}

	@Override
	public String toString() {
		return "Invoice [trnasactionId=" + trnasactionId + "]";
	}
}