package entitties;

public class BusinessAccount extends Account {
	private Double loanlimit;
	
	public BusinessAccount(){
		
	}

	public BusinessAccount(int number, String holder, double balance, Double loanlimit) {
		super(number, holder, balance);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanlimit) {
		balance += amount - 10.0;
		}
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
