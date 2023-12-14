package Javapractice1;

public class ForLoopAssignment1 {

	public static void main(String[] args) {
		
		int star = 10;
		for (int i=0;i<star;i++)
		{
			for (int j=0;j<star-i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
