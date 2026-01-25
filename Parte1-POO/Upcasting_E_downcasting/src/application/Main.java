package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1001, "Alex", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		//vai da erro pq acc3 não é um BusinessAccount e sim um SavingAccount
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		//para verificar se é possivel instancia, podemos usar o instanceof para verificar
		//nesse caso vai da erro
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		} 
		//E esse vai da certo
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
