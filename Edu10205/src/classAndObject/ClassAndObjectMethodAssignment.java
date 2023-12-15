package classAndObject;
 
       class addition
       {
    	   int result;
    	  public void add(int a, int b)
    	   {
    		  this.result = a+b;
    		  
    	   }
    	  public void showresult()
    	  {
    		  System.out.println(this.result);
    	  }
    	  
       }
       


public class ClassAndObjectMethodAssignment {

	public static void main(String[] args) {
		
		addition ad = new addition();
		ad.add(78, 56);
		ad.showresult();
		
	

	}

}
