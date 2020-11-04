package com.example.productmanagement.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 3, 2020
 *
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class PackageInternalServerError extends RuntimeException {
	private String detailMessage;

	public PackageInternalServerError(String exception) {
		super(exception);
		this.detailMessage = exception;
	}

	public String getDetailMessage() {
		return detailMessage;
	}
}