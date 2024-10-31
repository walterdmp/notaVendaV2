package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItem> itens = new ArrayList<>();
	private CreatorProduct cp = new CreatorProduct();
	
	public void addSaleItem(Product product, int quantity) {
		this.itens.add(new SaleItem(product, quantity));
	}
	
	public double getTotal() {
		double total = 0;
		
		for (SaleItem saleItem : itens) {
			total += saleItem.getSubtotal();
		}
		
		return total;
	}
	
	public List<SaleItem> getItems(){
		return new ArrayList<>(itens);
	}
	
	public CreatorProduct getCp() {
		return cp;
	}

	public void printSaleItens() {
		for (SaleItem item : getItems()) {
			System.out.println(item);
		}
	}
	
}