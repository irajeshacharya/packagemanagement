package com.example.productmanagement.exceptionhandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 3, 2020
 *
 */
@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(PackageNotFoundException.class)
	public final ResponseEntity<ErrorDetails> handlePackageNotFoundException(PackageNotFoundException ex,
			WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getDetailMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ProductNotFoundException.class)
	public final ResponseEntity<ErrorDetails> handleProductNotFoundException(ProductNotFoundException ex,
			WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getDetailMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(PackageInternalServerError.class)
	public final ResponseEntity<ErrorDetails> handlePackageInternalServerError(PackageInternalServerError ex,
			WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getDetailMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(PackagePayloadError.class)
	public final ResponseEntity<ErrorDetails> handlePackagePayloadError(PackagePayloadError ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getDetailMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ProductPayloadError.class)
	public final ResponseEntity<ErrorDetails> handleProductPayloadError(ProductPayloadError ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getDetailMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}
}
