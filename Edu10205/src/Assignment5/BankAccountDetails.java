package Assignment5;

public class BankAccountDetails {
	
	long acc_no;
	String acc_name;
	long amount;
	long dep;
	long trans;
	
	void setval()
	{
	  acc_no= 123456789;
	  acc_name="ROHINI";
	  amount= 100000;
	  dep= 50000;
	  trans=10000;
	  
	}

	void getval()
	{
		
		System.out.println("account number is "+ acc_no);
		System.out.println("acc_name is " + acc_name);
		System.out.println("amount is " + amount);
		System.out.println("deposited amount is " + dep);
		System.out.println("transaction amount is " + trans);
		
		
		
	}

	public static void main(String[] args) 
	{
	
        BankAccountDetails r=new BankAccountDetails();
		
		r.setval();
		r.getval();

	}

}
