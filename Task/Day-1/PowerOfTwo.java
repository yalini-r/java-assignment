
 import java.util.Scanner;
 public class  PowerOfTwo{
 
 
 public static boolean  checkPowerOfTwo(int num){
	 
	 
	 if(num <=0){
		 return false;
	 }
	 
	 while( num > 1){
		 if(num%2 == 0){
			 num /=2;
		 }else{
			 return false;
		 }
			 
	 }
	 return true;
 }
 
 
 
 public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
	
	 System.out.println("enter a digit ");
	 
	   int num = sc.nextInt();
	   
	   
	   if( checkPowerOfTwo(num)){
		   
		   System.out.println( num + " is a power of 2");
	   }else{
		   System.out.println( num + " is not a power of 2");
	   }
 
 }
 }