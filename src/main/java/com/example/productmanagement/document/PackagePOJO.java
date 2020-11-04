package com.example.productmanagement.document;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
public class PackagePOJO {
	private static final long serialVersionUID = -2128145903586535356L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private Integer id;
	private String name;
	private String description;
	private List<Product> products;
	private double price;
	private String base;

	public PackagePOJO(String name, String description, List<Product> products, double price, String base) {
		super();
		id = count.incrementAndGet();
		this.name = name;
		this.description = description;
		this.setProducts(products);
		this.price = price;
		this.base = base;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
