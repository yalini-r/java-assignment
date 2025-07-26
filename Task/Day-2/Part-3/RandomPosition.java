
import java.util.Scanner;
public class RandomPosition{
	
	
	public static String returnExtra(String s ,String t){
		
		 int[] count = new int[26];

       
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

       
        StringBuilder extra = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (count[c - 'a'] > 0) {
                count[c - 'a']--; 
            } else {
                extra.append(c); 
            }
        }

        return extra.toString();
		
		
	}
	
public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   System.out.print("enter a string s : ");
     String s = sc.next();
	 
   System.out.print("enter a string t : ");
	 String t= sc.next();
	 
	System.out.println("the extra string is : "+returnExtra(s ,t));
	 
	 
	   
	   
	   
	   
   
  
  
  }


}