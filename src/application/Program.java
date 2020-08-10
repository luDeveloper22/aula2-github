package application;

import java.util.Locale;
import java.util.Scanner;
import mode.exception.DomainException;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        try {
	        System.out.println("Enter account data");
			System.out.print("Number: ");
			int accountNumber = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String accountHolder = sc.nextLine();
			System.out.print("Initial balace: ");
			Double accountBalace = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double accountWithdrawLimit = sc.nextDouble();
			Account account = new Account(accountNumber, accountHolder, accountBalace, accountWithdrawLimit);
	
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println();
			System.out.printf("New balace %.2f", account.getBalace());
	
			sc.close();
	
			}

       catch (DomainException e) {
	      System.out.println("Withdraw erro: " + e.getMessage());
             }
        
        catch(RuntimeException e) {
        	System.out.println("Unexpected error");
        }
	}

}
