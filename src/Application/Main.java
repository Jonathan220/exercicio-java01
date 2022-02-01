package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

//import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char isInitialDeposit = sc.next().charAt(0);
		
		
		
		if(Character.compare(isInitialDeposit, 'y') == 0) {
			System.out.print("Enter initial deposit value: ");
			double depositValue = sc.nextDouble();
			conta = new Conta(accountNumber, accountHolder, depositValue);			
		}
		else {
			conta = new Conta(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		conta.sacar(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}

}
