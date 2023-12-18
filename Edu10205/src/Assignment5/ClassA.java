package Assignment5;


class Add {

	
	public int add(int a, int b)
	{

		int sum = a + b;
		return sum;
	}

	
	public int add(int a, int b, int c)
	{

		int sum = a + b + c;
		return sum;
	}
}


class ClassA {

	
	public static void main(String[] args)
	{

		
		Add ob = new Add();

		
		int sum1 = ob.add(47, 56);

		
		System.out.println("sum of the two integer value :"
						+ sum1);

	
		int sum2 = ob.add(47, 56, 96);

		
		System.out.println(
			"sum of the three integer value :" + sum2);
	}



	}


