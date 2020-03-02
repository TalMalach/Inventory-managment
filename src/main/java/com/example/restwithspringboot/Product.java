package com.example.restwithspringboot;

public class Product {

	private static int count = 0;
	private final long product_id;
	private final String product_name;
	private final long product_amount;
	private final long inventory_code;

	public Product(String product_name, long product_amount, long inventory_code) {
		this.product_id = ++count;
		this.product_amount = product_amount;
		this.product_name = product_name;
		this.inventory_code = inventory_code;
	}

	public long getInventoryCode() {
		return inventory_code;
	}

	public long getProductAmount() {
		return product_amount;
	}

	public long getProductId() {
		return product_id;
	}

	public String getProductName() {
		return product_name;
	}

}
