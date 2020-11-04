package com.example.productmanagement.response;

import java.util.List;

import com.example.productmanagement.document.Product;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 3, 2020
 *
 */
public class ProductResponse {
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
