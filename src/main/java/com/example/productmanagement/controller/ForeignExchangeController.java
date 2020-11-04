package com.example.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productmanagement.service.ForeignExchangeService;
import com.example.productmanagement.service.RatesResponse;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
@RestController
@RequestMapping(value = "api/v1/foreignexchange")
public class ForeignExchangeController {
	@Autowired
	ForeignExchangeService foreignExchangeService;

	@GetMapping
	@ResponseBody
	public RatesResponse getAllProduct() {
		return foreignExchangeService.getForeignExchange();
	}
}
