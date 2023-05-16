package com.project;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		int pin = 4321;
		int balance = 1000;
		int AddAmount = 12;
		int TakeAmount;
		String name;
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter your pin number:");
		int Password = sa.nextInt();
		if (Password == pin) {
			System.out.println("Enter your name:");
			name = sa.next();
			while (true) {
				System.out.println("1.Check your balance \n" + "2.add amount \n" + "3.take amount\n"
						+ "4.take receipt\n" + "5.exit");
				int option = sa.nextInt();
				switch (option) {
				case 1:
					System.out.println("your current balance is: " + balance);
					break;
				case 2:
					System.out.println("Hoe much amount you add to account: ");
					AddAmount = sa.nextInt();
					System.err.println("successfully added");
					balance = AddAmount + balance;
					break;
				case 3:
					System.out.println("press enter amount:");
					TakeAmount = sa.nextInt();
					if (TakeAmount > balance) {
						System.err.println("insufficient balance");
						System.out.println("try less amount your account balance");
					} else {
						System.err.println("success fully taken");
						balance = balance - TakeAmount;
					}
					break;
				case 4:
					System.err.println("Welcome to ATM");
					System.out.println("Available balance: " + balance);
					System.out.println("Amount deposited: " + AddAmount);
					System.err.println("Thanks for coming");
					break;
				default:
					System.out.println("Press 5 to Exit");
					break;
				}
				if (option == 5) {
					System.err.println("Thank you");
					break;
				} else {
					System.err.println("Payment finished");

				}

			}
		}
	}

}
