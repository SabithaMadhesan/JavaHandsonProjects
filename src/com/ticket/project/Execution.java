package com.ticket.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {

	static String username = "Sabitha";
	static String password = "Sabi#magi#";
	static Scanner sb = new Scanner(System.in);
	static ArrayList<Pojo> arraylist = new ArrayList<Pojo>();

	public static void main(String[] args) {
		Pojo s = new Pojo(1, "Magi", "Akash", "login issue", "todo");
		Pojo s1 = new Pojo(2, "Tamil", "Babu", "Server slow", "in progress");
		Pojo s2 = new Pojo(3, "Ram", "Ashath", "user name wrong", "done");

		arraylist.add(s);
		arraylist.add(s1);
		arraylist.add(s2);
		System.out.println("**Welcome to Jira Ticket**");
		while (true) {
			System.out.println("1. Create ticket\n" + "2. View ticket\n" + "3. Update ticket\n" + "4. Delete ticket\n"
					+ "5. logout");

			System.out.println("Enter any one option: ");
			int option = sb.nextInt();
			switch (option) {
			case 1:
				Helper.createTicket(sb, arraylist);
				break;
			case 2:
				Helper.viewTicket(sb, arraylist);
				break;
			case 3:
				Helper.updateTicket(sb, arraylist);
				break;
			case 4:
				Helper.deleteTicket(sb, arraylist);
				break;
			case 5:
				Helper.logout(sb, arraylist);
				break;

			}

		}

	}

}
