
import java.util.Scanner;

public class EqualOrNot{

     
	 public static  void checkEqualOrNot(int a , int b){
		 
		   int res = a ^ b;
		   if( res == 0){
			    System.out.println("equal");
		   }else if(res == 1){
			    System.out.println("not equal");
			   
		   }
		
	 }
	 
	 
  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("enter two numbers ");
	 
	 System.out.print("enter number a : ");
	 
	  int a = sc.nextInt();
	  
	 System.out.print("enter number b : "); 
	 
	  int b = sc.nextInt();
	  
	     checkEqualOrNot(a , b) ;
	
   }
}