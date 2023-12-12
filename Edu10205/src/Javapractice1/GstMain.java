package Javapractice1;
import java.util.Scanner;

import java_sessions.Event;
import java_sessions.Exhibition;
import java_sessions.StageEvent;
public class GstMain {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Event name:");
	String name = sc.nextLine();
	System.out.println("Enter cost per day:");
	double costPerday=sc.nextDouble();
	System.out.println("Enter no Of day:");
	int noOfDays=sc.nextInt();
	System.out.println("Enter the type of event \n 1. Exhibition \n 2. StageEvent");
	int type=sc.nextInt();
	Event event;
	if(type==1) {
		System.out.println("Enter the no of stalls:");
		int noOfStalls=sc.nextInt();
		event=new Exhibition(name, "Exhibition", costPerday, noOfDays, noOfStalls);
		System.out.println(event.toString());
	}
	else if(type==2) {
		System.out.println("Enter the no of stalls");
		int noOfStalls=sc.nextInt();
		event=new StageEvent(name, "StageEvent", costPerday, noOfDays, noOfStalls);
		System.out.println(event.toString());
	}
	else {
		System.out.println("Invalid input");
	}
	}

}
	