
import java.util.Scanner;

public class Block{
	
	final static int num1;

    final int num2;
	
	
	   public Block(){
		   System.out.println("constructor got executed ");
	   }
	
	//we can initialize final variale before main method got invoked
	static{
		
		System.out.println("static initializer");
		
		
	    Scanner sc = new Scanner(System.in);
		
        System.out.println("enter a number");
	  
		 num1 = sc.nextInt();
		  
		System.out.println("the number is :" + num1);
	}
	
	
	//we can initialize final variale before constructor get invoked
	
	{    
	    System.out.println("instance initializer");
		
	    Scanner sc = new Scanner(System.in);
		
        System.out.println("enter a number");
	  
		 num2 = sc.nextInt();
		  
		System.out.println("the number is :" + num2);
		 
	}


    public static void main(String[] args){
		
		  System.out.println("Main method got executed");
		  
		      Block b = new Block();
			  
			  
			   
			   
          
   
  }
}
