package model;

public class SaleItem {
	private Product product;
	private int quantity;
	
	public SaleItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		return product.getPrice() * quantity;
	}
	
	@Override
	public String toString() {
		String itemStr = String.format("%d x %s - R$%.2f", 
				this.getQuantity(),
				this.getProduct().getDescription(), 
				this.getSubtotal());
		
		return itemStr;
	}
}