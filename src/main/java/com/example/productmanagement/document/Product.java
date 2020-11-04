package com.example.productmanagement.document;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 3, 2020
 *
 */
public class Product implements Serializable {
	private static final long serialVersionUID = -964199425100702582L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private Integer id;
	private String name;
	private String description;
	private double price;
	private String base;

	Product() {

	}

	public Product(String name, String description, double price, String base) {
		super();
		id = count.incrementAndGet();
		this.description = description;
		this.name = name;
		this.price = price;
		this.setBase(base);
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
