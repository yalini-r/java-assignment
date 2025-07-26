import java.util.Scanner;

public class Vowels {
    
    public static String swapVowels(String str) {
        char[] ch = str.toCharArray();
		
        int left = 0, right = ch.length - 1;
		
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(ch[left]) == -1) {
                left++;
            }
			
            while (left < right && vowels.indexOf(ch[right]) == -1) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string:");
        String str = sc.nextLine();
		
       System.out.println("After reversing vowels: " + swapVowels(str));
    }
}
