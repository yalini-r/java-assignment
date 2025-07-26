
import java.util.Scanner;

public class StringSegments{
	
    public static int countSegments(String s) {
        String[] parts = s.split(" ");
        int count = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       
	   Scanner sc = new Scanner(System.in);
	    System.out.print("enter a string : ");
          String s = sc.nextLine();
		  
		  
    System.out.println("the count of segement is : " + countSegments(s));
		  
    }
}
