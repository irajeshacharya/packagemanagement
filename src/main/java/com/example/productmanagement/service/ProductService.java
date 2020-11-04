package com.example.productmanagement.service;

import java.util.List;

import com.example.productmanagement.document.Product;
import com.example.productmanagement.request.ProductRequest;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 3, 2020
 *
 */
public interface ProductService {
	Product createProduct(ProductRequest request);

	Product getProduct(Integer id);

	List<Product> getAllProduct();

	Product updateProduct(Integer id, ProductRequest request);
}
