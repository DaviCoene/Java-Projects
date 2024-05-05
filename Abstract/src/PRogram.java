import java.util.ArrayList;
import java.util.List;

import entitties.Account;
import entitties.BusinessAccount;
import entitties.SavingsAccount;

public class PRogram {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		list.add(new BusinessAccount(1003, "bob", 1000.0, 200.0));
		list.add(new SavingsAccount(1004, "john", 1000.0, 0.01));
		list.add(new BusinessAccount(1001, "BONEI", 105600.0, 200.0));
		list.add(new SavingsAccount(1002, "JHON", 1000.0, 0.20));
		
		double sum = 0.0;
		
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.println(sum);
		
		for (Account acc : list) {
			acc.deposit(10);
		}
		for (Account acc : list) {
			System.out.println(acc.getBalance());
		}
	}

}
