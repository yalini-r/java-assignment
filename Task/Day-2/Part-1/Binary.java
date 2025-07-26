
import java.util.Scanner;


public class Binary{
	
public static String convertToBinary(int n){
	
	String bi ="";
	
	if(n == 0){
		return "0";
	}
    
	while ( n != 0){
		  int rem = n%2;
	      bi = rem + bi;
          n/=2;
		 }
	return bi;
}


public static void main(String[] agrs){

    Scanner  sc = new Scanner(System.in);
	
	System.out.print("enter a number : ");
      int num = sc.nextInt();
	
	System.out.println(convertToBinary(num));
}

}