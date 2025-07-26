
import java.util.Scanner;
public class ExcelSheet{
	
public static String convertColumnTitle(int columnNumber){
		 StringBuilder sb = new StringBuilder();
		 
		 while(columnNumber > 0){
		   columnNumber--;
		   int rem = columnNumber%26;
		   char ch = (char) (rem + 'A');
		     sb.append(ch);
			  columnNumber/=26;
		   
	       }
	   
	   sb.reverse();
	   
       	
		return sb.toString();
		
	}

    
 public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Excel column number: ");
	int columnNumber = sc.nextInt();
	
System.out.println("Excel Column Title: " + convertColumnTitle(columnNumber));
		
	
		
		sc.close();
	}
	


}