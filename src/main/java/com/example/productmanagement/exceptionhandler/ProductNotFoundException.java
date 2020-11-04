package com.example.productmanagement.exceptionhandler;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
public class ProductNotFoundException extends RuntimeException {
	private String detailMessage;

	public ProductNotFoundException(String exception) {
		super(exception);
		this.detailMessage = exception;
	}

	public String getDetailMessage() {
		return detailMessage;
	}
}
