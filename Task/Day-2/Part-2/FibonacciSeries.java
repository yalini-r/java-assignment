public class FibonacciSeries{

public static void  printFibonacciSeries(){
	int num =30;
	
	int[] fibo = new int[num];//length from 1......30
	  fibo[0] = 0;
	  fibo[1] = 1;
	
	for(int i=2; i< num  ; i++){
		fibo[i] = fibo[i-1] + fibo[i-2];
		  
	}
	
	System.out.println("----------------------fibonacci Series---------------");
	
	for(int i=0; i< num ; i++){
		System.out.print(fibo[i] + " ");
		
	}
	
	
}
public static void main(String[] args){
	
	printFibonacciSeries();
}
}