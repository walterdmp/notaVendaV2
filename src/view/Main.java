package view;

import model.Sale;

public class Main {

	public static void main(String[] args) {	
		Sale sale = new Sale();
		sale.getCp().addProduct("Arroz Tatiana", 30);
		sale.getCp().addProduct("Feijão Feijó", 20);
		sale.getCp().addProduct("Macarrão Santa Amália", 15);
		sale.addSaleItem(sale.getCp().getProducts().get(0), 2);
		sale.addSaleItem(sale.getCp().getProducts().get(1), 1);
		sale.addSaleItem(sale.getCp().getProducts().get(2), 6);
		
		sale.printSaleItens();
		
		System.out.println(String.format("Total: %.2f", sale.getTotal()));
		
	}
}