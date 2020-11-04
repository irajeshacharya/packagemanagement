package com.example.productmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.productmanagement.document.Product;
import com.example.productmanagement.exceptionhandler.ProductNotFoundException;
import com.example.productmanagement.exceptionhandler.ProductPayloadError;
import com.example.productmanagement.request.ProductRequest;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 3, 2020
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	ConcurrentHashMap<Integer, Product> map = new ConcurrentHashMap<>();

	@Override
	public Product createProduct(ProductRequest request) {
		payloadValidation(request);
		Product product = null;
		product = new Product(request.getName(), request.getDescription(), request.getPrice(), "USD");
		map.put(product.getId(), product);

		return product;
	}

	@Override
	public Product getProduct(Integer id) {
		isProductIdExist(id);
		return map.get(id);
	}

	@Override
	public List<Product> getAllProduct() {
		return new ArrayList<>(map.values());
	}

	@Override
	public Product updateProduct(Integer id, ProductRequest request) {
		isProductIdExist(id);
		payloadValidation(request);
		Product product = map.get(id);
		if (!product.getName().equalsIgnoreCase(request.getName())) {
			product.setName(request.getName());
		}

		if (product.getPrice() != request.getPrice()) {
			product.setPrice(request.getPrice());
		}

		if (!product.getDescription().equalsIgnoreCase(request.getDescription())) {
			product.setDescription(request.getDescription());
		}
		return map.put(id, product);
	}

	private void isProductIdExist(Integer id) {
		if (!map.containsKey(id)) {
			throw new ProductNotFoundException("ID : " + id);
		}
	}

	private void payloadValidation(ProductRequest request) {
		if (request == null || StringUtils.isEmpty(request.getName()) || request.getPrice() <= 0) {
			throw new ProductPayloadError("Invalid Payload");
		}
	}

}
