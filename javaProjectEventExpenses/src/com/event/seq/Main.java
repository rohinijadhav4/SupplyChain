package com.event.seq;

import java.util.Scanner;

/**
 * The main class with main method in control the flow of execution.
 * This class accepts the input from the user and creates Event, Stage Event and Exhibition
 * Accepts event name,costPerday,noOfDays,from user using scanner class.
 * If type value is 1 Represent Exhibition:- Initialize event object using  exhibition class constructor.
 * If type value is 2 Represent Stage Event:- Initialize event object using Stage Event class constructor.
 * Else if value is enter user is other then 1, 2 then show invalid input error massage.
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Event name:");
		String name = sc.nextLine();
		System.out.println("Enter cost per day:");
		double costPerday = sc.nextDouble();
		System.out.println("Enter no Of days:");
		int noOfDays = sc.nextInt();
		System.out.println("Enter the type of event \n 1. Exhibition \n 2. StageEvent");
		int type = sc.nextInt();
		Event event;
		if (type == 1) {
			System.out.println("Enter the no of stalls:");
			int noOfStalls = sc.nextInt();
			event = new Exhibition(name, "Exhibition", costPerday, noOfDays, noOfStalls);
			System.out.println(event.toString());
		} else if (type == 2) {
			System.out.println("Enter the no of seats");
			int NoOfSeats = sc.nextInt();
			event = new StageEvent(name, "StageEvent", costPerday, noOfDays, NoOfSeats);
			System.out.println(event.toString());
		} else {
			System.out.println("Invalid input");

		}
	}

}
