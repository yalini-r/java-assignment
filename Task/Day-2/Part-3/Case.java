
import java.util.Scanner;
public class Case{
	
	
    public static boolean checkCase(String word) {
        int upper = 0, lower = 0;
		
        for (char c : word.toCharArray()) {
			
            if (Character.isUpperCase(c)){
				upper++;
			}
            else {
				lower++;
			}
        }

        if (upper == word.length()) {
		     return true;
		}
       else  if (lower == word.length()){ 
		return true; 
		}
       else  if (upper == 1 && Character.isUpperCase(word.charAt(0))) {
		   return true; 
	   }
	   
        return false;
    }

    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	       System.out.print("enter a string : ");
          String s = sc.nextLine();
		  
		  
    System.out.println("use of capitals in a "+ s +" word is: " + checkCase(s));
        
    }
}
