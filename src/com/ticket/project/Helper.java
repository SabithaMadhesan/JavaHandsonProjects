package com.ticket.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

	public static void createTicket(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Enter new Id:");
		int Id = sb.nextInt();
		System.out.println("Enter new Assignee_Name:");
		String Assignee_Name = sb.next();
		System.out.println("Enter new Reporter_Name:");
		String Reporter_Name = sb.next();
		System.out.println("Enter new Heading:");
		String Heading = sb.next();
		System.out.println("Enter new Status:");
		String Status = sb.next();
		System.out.println("**Ticket Created Successfully**");

		Pojo s1 = new Pojo(Id, Assignee_Name, Reporter_Name, Heading, Status);
		arraylist.add(s1);

	}

	public static void viewTicket(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Choose any option from below:\n" + "1. Single ticket\n" + "2. All ticket Id\n"
				+ "3. All ticket Name\n" + "4. All ticket Heading\n" + "5. All ticket Status");

		int option = sb.nextInt();
		switch (option) {
		case 1:
			Module.single_Ticket(sb, arraylist);
			break;
		case 2:
			Module.all_Sorted_Id(sb, arraylist);
			break;
		case 3:
			Module.all_Name(sb, arraylist);
			break;
		case 4:
			Module.all_Heading(sb, arraylist);
			break;
		case 5:
			Module.all_Status(sb, arraylist);
			break;

		}
	}

	public static void updateTicket(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Choose any option from below:\n" + "1. Change Assignee Name\n" + "2. Change Heading\n"
				+ "3. Change Status\n");

		int option = sb.nextInt();
		switch (option) {
		case 1:
			Module.change_Assignee_Name(sb, arraylist);
			break;
		case 2:
			Module.change_Heading(sb, arraylist);
			break;
		case 3:
			Module.change_Status(sb, arraylist);
			break;

		}
	}

	public static void deleteTicket(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Choose any option from below:\n" + "1. Delete Single Ticket\n" + "2. Delete all Ticket");

		int option = sb.nextInt();
		switch (option) {
		case 1:
			Module.delete_single_Ticket(sb, arraylist);
			break;
		case 2:
			Module.delete_All_Ticket(sb, arraylist);
			break;

		}

	}

	public static void logout(Scanner sb, ArrayList<Pojo> arraylist) {
		System.err.println("**Thank You for Your Visit**");
//		System.out.println();
//		System.out.println("1. Create ticket\n"
//				+ "2. View ticket\n"
//				+ "3. Update ticket\n"
//				+ "4. Delete ticket\n"
//				);

	}

}
