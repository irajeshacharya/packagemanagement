package com.example.productmanagement.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
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
