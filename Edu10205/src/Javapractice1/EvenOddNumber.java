package Javapractice1;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scanner.nextInt();
		if(number % 2 == 0)
		{
			System.out.println("Number is even:" +number);
		}
		else
		{
			System.out.println("Number is odd:" +number);
		}
	}

}
