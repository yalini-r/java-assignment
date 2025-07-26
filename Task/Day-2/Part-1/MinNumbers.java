
import java.util.Scanner;

 public class MinNumbers{
 
 
 
 public int checkMinOfThree(int[] arr){
	 
	 int min = arr[0];
	 
	 for(int i=1; i<3; i++){
		 
		 if(arr[i] < min){
			 
			 min = arr[i];
			 
		 }
		 
	 }
	 return   min;
 }
   
 
 public static void main(String[] args){
 
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter a  3 numbers");
 
     int[] arr = new int[3];
	 
	 for(int i=0; i<3; i++){
	 
	    System.out.print("enter a number :");
		
		  arr[i] = sc.nextInt();
	 
	 }
	 MinNumbers  mn = new MinNumbers();
	 
	  System.out.println("minimum of three number is : " +mn.checkMinOfThree(arr));
	 
 
 }
 
 }