package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufacture;
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/YYYY");
	
	public UsedProduct() {
		
	}
	
	
	
	
	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	


	public Date getManufacture() {
		return manufacture;
	}




	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}




	@Override
	public String priceTag() {
		return  super.getName() + " (used) $"+  super.getPrice() + " (Manufacture date: "+ sdf1.format(manufacture)+")";
	}
}
