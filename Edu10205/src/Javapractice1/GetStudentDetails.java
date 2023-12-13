package Javapractice1;

import java.util.Scanner;

public class GetStudentDetails {

	public static void main(String[] args) {
		 {
	          String name;
	          int roll, M1, M2, M3;
	           
	          Scanner SC=new Scanner(System.in);
	           
	          System.out.print("Enter Name: ");
	          name=SC.nextLine();
	          System.out.print("Enter Roll Number: ");
	          roll=SC.nextInt();
	          System.out.print("Enter marks in M1, M2 and M3: ");
	          M1=SC.nextInt();
	          M2=SC.nextInt();
	          M3=SC.nextInt();
	           
	          int total=M1+M2+M3;
	          float perc=(float)total/300*100;
	           
	          System.out.println("Roll Number:" + roll +"\tName: "+name);
	          System.out.println("Marks (M1, M2, M3): "+M1+","+M2+","+M3);
	          System.out.println("Total: "+total +"\tPercentage: "+perc);
	     
	          if(perc>=35)
	          {
	        	  System.out.println("Student is pass");
	          }
	          else
	          {
	        	  System.out.println("Student is fail");
	          }
	          
	          
	      }
		 
	          
	}

	}


