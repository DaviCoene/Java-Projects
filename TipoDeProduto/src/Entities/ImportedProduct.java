package Entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct(){
		super();	
	}
	
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double totalprice() {
		double valor = super.getPrice() + customsFee; 
		return valor;
	}


	@Override
	public String priceTag() {
		return getName() + " $" + String.format("%.2f", totalprice())+ " (Customs fee: " + String.format("%.2f", customsFee) +")";
	}
	

}
