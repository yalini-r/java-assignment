
import java.util.Scanner;
public class Digits{

    public static void printDigits(int x[], int n) {
        int  singleDigit= 0;
        int  doubleDigit= 0;

        for (int i = 0; i < n; i++) {
			
            if (x[i] >= 0 && x[i] <= 9) {
				
                singleDigit += x[i];
				
            } else if (x[i] >= 10 && x[i] <= 99) {
				
                doubleDigit += x[i];
            }
        }

        System.out.println("Sum of singledigit elements: " + singleDigit);
        System.out.println("Sum of doubledigit elements: " + doubleDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter  " + len + "  elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
         printDigits(arr, len);
    }
}
