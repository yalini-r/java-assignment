import java.util.Scanner;

public class FirstSetBit {
	
	
	public static void findFirstSetBit(int num){
		  int position = 1;
     //bitwise AND op - compares it
        while ((num & 1) == 0 && num != 0) {
			
            num = num >> 1;
			
            position++;
        }

        if (num == 0) {
			
            System.out.println("No set bits found ");
			
        } else {
			
            System.out.println("The position of the firstsetbit is: " + position);
        }
		
	}

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
		int num = sc.nextInt();

        findFirstSetBit (num);
       
    }
}
