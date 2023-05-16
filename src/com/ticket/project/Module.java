package com.ticket.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Module {
	public static void single_Ticket(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Enter Id no: ");
		int id = sb.nextInt();

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			if (p.getId() == id) {
				System.err.println("Id= " + p.getId() + "  " + "Assignee_Name= " + p.getAssigneeName() + "  "
						+ "Reporter_Name= " + p.getReporterName() + "  " + "Heading= " + p.getHeading() + "  "
						+ "Status= " + p.getStatus());
				break;
			}
		}
	}

	public static void all_Sorted_Id(Scanner sb, ArrayList<Pojo> arraylist) {

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			System.err.println("Id= " + p.getId());
		}

	}

	public static void all_Name(Scanner sb, ArrayList<Pojo> arraylist) {

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			System.err.println("Assignee Name = " + p.getAssigneeName());
		}

	}

	public static void all_Heading(Scanner sb, ArrayList<Pojo> arraylist) {

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			System.err.println("Assignee Heading = " + p.getHeading());
		}

	}

	public static void all_Status(Scanner sb, ArrayList<Pojo> arraylist) {

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			System.err.println("Assignee Status = " + p.getStatus());
		}

	}

	public static void change_Assignee_Name(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Enter Id no: ");
		int i = sb.nextInt();
		System.out.println("Enter new Assignee Name: ");
		String vs = sb.next();
		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			if (p.getId() == i) {
				p.setAssigneeName(vs);
				System.err.println("Assignee Name = " + p.getStatus());
				break;
			}
		}
	}

	public static void change_Heading(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Enter Id no: ");
		int j = sb.nextInt();
		System.out.println("Enter new Heading: ");
		String vs = sb.next();
		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			if (p.getId() == j) {
				p.setHeading(vs);
				System.err.println("Heading = " + p.getHeading());
				break;
			}
		}
	}

	public static void change_Status(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Enter Id no: ");
		int k = sb.nextInt();
		System.out.println("Enter new Status: ");
		String vs = sb.next();
		Iterator<Pojo> itr = arraylist.iterator();
		Pojo p = null;
		while (itr.hasNext()) {
			p = itr.next();
			if (p.getId() == k) {
				p.setStatus(vs);
				System.err.println("Status= " + p.getStatus());
				break;
			}
		}
	}

	public static void delete_single_Ticket(Scanner sb, ArrayList<Pojo> arraylist) {
		System.out.println("Enter the Id number to delete: ");
		int l = sb.nextInt();
		Iterator<Pojo> a1 = arraylist.iterator();
		Pojo p = null;
		while (a1.hasNext()) {
			p = a1.next();
			if (p.getId() == l) {
				a1.remove();
				System.err.println("Deleted Successfully");
				break;
			}
		}
	}

	public static void delete_All_Ticket(Scanner sb, ArrayList<Pojo> arraylist) {
		Iterator<Pojo> itr = arraylist.iterator();
		Pojo q = null;
		while (itr.hasNext()) {
			q = itr.next();
			itr.remove();
			System.err.println("All Ticket Deleted Successfully");

		}
	}
}
