package Javapractice1;

import java.util.Scanner;

public class EligibleAgeForVoterId {

	public static void main(String[] args) {
		int user_age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the user_age");
		user_age=scan.nextInt();
		System.out.println("The age of the user is"+user_age);
		if (user_age>=18) {
			System.out.println("The user is eligible to vote");
			
		}
		else {
			System.out.println("The user is not eligible to vote");
			
		}

	}

}
