package Javapractice1;
public class ArithmeticOperation {
	
	public void add(int a, int b) {
		System.out.println(a+b);
		}
    public void subtract(int a, int b) {
    	System.out.println(a-b);
    	  }
    public void multiple(int a, int b) {
    	System.out.println(a*b);
    	  }
    public void divid(int a, int b) {
    	System.out.println(a/b);
    	  }
    public void mod(int a, int b) {
    	System.out.println(a%b);
    }
	public static void main(String[] args) {
		ArithmeticOperation AO = new ArithmeticOperation();
		
		AO.add(56, 32);
		AO.subtract(96, 13);
		AO.multiple(19, 26);
		AO.divid(105, 5);
		AO.mod(160, 96);
		}

}
