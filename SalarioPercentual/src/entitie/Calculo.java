package entitie;

public class Calculo {
	
	private String Name;
	private double GrossSalary;
	private int Tax;
	
	public Calculo() {
	}
	public Calculo(String Name, double GrossSalary, int Tax) {
		this.Name = Name;
		this.GrossSalary = GrossSalary;
		this.Tax = Tax;
	}
	public Calculo(String Name, double GrossSalary) {
		this.Name = Name;
		this.GrossSalary = GrossSalary;
	}

	public String getName() {
		return this.Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public double getGrossSalary() {
		return this.GrossSalary;
	}
	public void setGrossSalary(double GrossSalary) {
		this.GrossSalary = GrossSalary;
	}
	public int getTax() {
		return Tax;
	}
	public double netSalary() {
		double a =  GrossSalary - Tax;
		return a;
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary = GrossSalary + (GrossSalary * (percentage/100));
		
	}
}
