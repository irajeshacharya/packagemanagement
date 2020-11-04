package com.example.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productmanagement.document.Product;
import com.example.productmanagement.request.ProductRequest;
import com.example.productmanagement.service.ProductService;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 3, 2020
 *
 */
@RestController
@RequestMapping(value = "api/v1/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping
	@ResponseBody
	public Product createProduct(@RequestBody ProductRequest request) {
		return productService.createProduct(request);
	}

	@GetMapping(value = "/{id}")
	@ResponseBody
	public Product getProduct(@PathVariable("id") Integer id) {
		return productService.getProduct(id);
	}

	@GetMapping
	@ResponseBody
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	@PutMapping(value = "/{id}")
	@ResponseBody
	public Product updateProduct(@PathVariable("id") Integer id, @RequestBody ProductRequest request) {
		return productService.updateProduct(id, request);
	}

}
