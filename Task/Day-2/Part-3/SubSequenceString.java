import java.util.Scanner;
public class  SubSequenceString{
	
 public static boolean isSubSequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a string s : ");
	     String s = sc.next();
		 
		 System.out.print("enter a string t : ");
		  String t = sc.next();
		 
	 System.out.println(isSubSequence(s, t));
        
    }
}





