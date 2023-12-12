package Javapractice1;

public class ElseIfExample {

	public static void main(String[] args) {
		int vid,adhar;
		
		vid=100;
		adhar =12345;
		
		if(vid==100)
		{
			System.out.println("Hey,You cast you vote");
		}
		else
		{
			if(adhar==12345)
			{
				System.out.println("Hey, You can cast you vote");
			}
			else
			{
				System.out.println("YOU ARE NOT ALLOWED TO CAST THE VOTE");
			}
		}
		

	}

}
