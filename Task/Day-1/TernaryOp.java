

import java.util.Scanner;

public class TernaryOp{

     
	 public static int printMaxi(int a , int b){
		 
		 
		return (a > b ) ? a : b;
	 }
	 
	 
 


 public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 
	 System.out.print("enter two numbers ");
	 
	 System.out.print("enter number a : ");
	 
	  int a = sc.nextInt();
	  
	 System.out.print("enter number b : "); 
	 
	  int b = sc.nextInt();
	  
	  System.out.print(printMaxi(a , b));
	
	
	  

}
}