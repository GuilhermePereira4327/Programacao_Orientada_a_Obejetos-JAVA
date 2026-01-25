package app;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingAccount(1020, "Alex", 1000.0, 0.01);
		Account z = new BusinessAccount(1020, "Alex", 1000.0, 300.0);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		z.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		System.out.println(z.getBalance());
		
		

	}

}
