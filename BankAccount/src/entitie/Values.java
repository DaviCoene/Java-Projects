package entitie;

public class Values {

	
	private int numberAccount;
	private String nameAccount;
	private double balance;
	
	public Values(int number, String name, double balance) {
		numberAccount = number;
		nameAccount = name;
		this.balance = balance;
	}
	
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getNameAccount() {
		return nameAccount;
	}
	
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	
	public double moreBalance(double more) {
		double result = balance + more; 
		return result;
	}
	
	public double lessBalance(double less) {
		double result = balance - less - 5;
		return result;
	}
}
