package com.example.productmanagement.exceptionhandler;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
public class ProductPayloadError extends RuntimeException {
	private String detailMessage;

	public ProductPayloadError(String exception) {
		super(exception);
		this.detailMessage = exception;
	}

	public String getDetailMessage() {
		return detailMessage;
	}
}
