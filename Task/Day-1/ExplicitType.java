
import java.util.Scanner;

public class ExplicitType{
	
	
    
	
  public static void doCast(double adouble , int bint){
	  
	  int a = (int) adouble;
	  
	  System.out.println("double is type casted to int : " + a);
	  
	  char b = (char) bint;
	  
	   System.out.println("int is type casted to byte : " + b);
	  
  }


public static void main(String[] args){
	
	

  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter a digit");
  
     double a = sc.nextDouble();
	 
  System.out.println("enter a digit");

       	 int  b = sc.nextInt();
	
	    doCast(a , b);
    

}
}