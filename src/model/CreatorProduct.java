package model;

import java.util.ArrayList;
import java.util.List;

public class CreatorProduct {
	private List<Product> products = new ArrayList<>();
	
	public void addProduct(String description, double price) {
		this.products.add(new Product(description, price));
	}
	
	public List<Product> getProducts(){
		return new ArrayList<>(products);
	}
}
