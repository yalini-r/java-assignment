import java.util.Scanner;
public class BinaryDecimal{
	
	
public static int convertToDecimal(String a , String b){
		
		int aDecimal =0;
			
		for (int i = 0; i < a.length(); i++) {
	  
	     char digit = a.charAt(i);
	     int  num = digit - '0';
	     aDecimal = aDecimal * 2 + num;
           
        }

   int bDecimal =0;	
   
   for (int i = 0; i < b.length(); i++) {
	  
	   char digit = b.charAt(i);
	    int  num = digit - '0';
	   bDecimal = bDecimal * 2 + num;
           
        }
		
		int sum = aDecimal+bDecimal;
		
		return sum;
		
		
	}
	
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
	
public static void main(String[] args){
		
  Scanner sc = new Scanner(System.in);
  
   System.out.print("Enter a binary number a : ");
  
  String a =sc.next();
  
 System.out.print("Enter a binary number b : ");
  String b = sc.next();
  
 int decimal = convertToDecimal(a ,b);
 
 String binary = convertToBinary(decimal);
  
 System.out.println("the binary number for "+ decimal + " is---------->" + binary );
       
        sc.close();
    }

}