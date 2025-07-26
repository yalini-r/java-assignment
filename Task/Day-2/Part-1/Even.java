
 import java.util.Scanner;
 
 
 public class Even{



  public int sumOfEven(int n){
	  
	  int sum =0;
	  int i=1;
	  
	  while(i <= n){
		   
		  if(i%2 !=0){
			   i++;
			  continue;
		  }
			  sum +=i;
			  i++;
		  }
	 
  
   return sum;
  }

 public static void main(String[]  args){
	 
	 Scanner sc =  new Scanner(System.in);
	 
	 System.out.println("enter a number  from 1   to  50");
	 
	   int num = sc.nextInt();
	 

    Even e = new Even();
	
	System.out.println("sum of even  number is : " +e.sumOfEven(num));

}

}