package Javapractice1;

public class countryMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the country name:");
		String name= sc.nextLine();
		System.out.println("Enter the country code:");
		String countrycode= sc.nextLine();
		System.out.println("Enter isd code:");
		String isdcode= sc.nextLine();
		Country c = new Country (name, countrycode, isdcode);
		c.display();
	}

}
