package entitie;

public class Product {
	
	public String name;
	public int stock;
	public double price;
	
	public int unitLess(int z) {
		int unitl = stock - z;
		return unitl;
	}
	public int unitAdd(int x) {
		int unita = stock + x;
		return unita;
	}
	public double total() {
		double mult = stock * price;
		return mult;
	}
	
	public String toString() {
		return "Product data: "
				+ name
				+ ", $ "
				+ String.format("%.2f", price)
				+", "
				+ stock
				+ " units, Total: $ "
				+ String.format("%.2f", total());
	}
}
