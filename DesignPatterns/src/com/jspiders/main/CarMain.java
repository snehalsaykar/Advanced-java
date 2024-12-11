package com.jspiders.main;

import java.util.Scanner;

import com.jspiders.creational.Alto;
import com.jspiders.creational.Car;
import com.jspiders.creational.Scorpio;
import com.jspiders.creational.Thar;
import com.jspiders.creational.XUV700;

public class CarMain {

	public static void main(String[] args) {

		System.out.println("Enter 1 to order Thar");
		System.out.println("Enter 2 to order Scorpio");
		System.out.println("Enter 3 to order XUV700");
		System.out.println("Enter 4 to order Alto");
		System.out.println("Enter your choice");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		try {
			factory(choice).order();
		} catch (NullPointerException e) {
			System.out.println("Something went wrong");
		}

	}

	private static Car factory(int choice) {
		Car car = null;
		switch (choice) {
		case 1:
			car = new Thar();
			break;
		case 2:
			car = new Scorpio();
			break;
		case 3:
			car = new XUV700();
			break;
		case 4:
			car = new Alto();
			break;
		default:
			System.out.println("Invalid choice");
		}
		return car;
	}

}

