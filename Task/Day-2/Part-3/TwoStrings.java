
import java.util.Scanner;
public class TwoStrings{


   public static String sumOfTwoString( String num1 ,String num2){
	   
	 
        String res = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int rem = 0;

        while (i >= 0 || j >= 0 || rem != 0) {
			
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + rem;
            res = (sum % 10) + res; 
            rem = sum / 10;

            i--;
            j--;
        }

        return res;
    }
	   
	public  static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("enter a string n1 : ");
   String num1 = sc.next();
   
   System.out.print("enter a string n2 : ");
   String num2 = sc.next();
   
   System.out.println("sum of two string is : " + sumOfTwoString(num1 , num2));
   
      
 
}
}
