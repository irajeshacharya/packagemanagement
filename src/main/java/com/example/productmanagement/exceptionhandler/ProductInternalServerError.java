package com.example.productmanagement.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ProductInternalServerError extends RuntimeException {
	private String detailMessage;

	public ProductInternalServerError(String exception) {
		super(exception);
		this.detailMessage = exception;
	}

	public String getDetailMessage() {
		return detailMessage;
	}
}
