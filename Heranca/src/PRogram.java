import entitties.Account;
import entitties.BusinessAccount;
import entitties.SavingsAccount;

public class PRogram {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 1000.0);
		
		

		
		//upcasting
		

		Account acc2 = new BusinessAccount(1003, "bob", 1000.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "john", 1000.0, 500.0);
		
		
		acc.withdraw(200.00);
		System.out.println(acc.getBalance());
		

		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		

		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		/*
		
		//downcasting
		//não dá certo  - acc2.loan(10);
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//isso n dá certo - BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("LOan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		*/
	}

}
