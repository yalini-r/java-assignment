import java.util.Scanner;

public class StudentMarks{
	
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int roll_no[] = new int[10];
         int total[] = new int[10];
          double avg[] = new double[10];
		
		for (int i = 0; i < 10; i++) {
			
            System.out.print("enter roll_no for student " + (i + 1) + ": ");
		     roll_no[i] = sc.nextInt();

            System.out.println("enter marks in 3 subjects: ");
             int m1 = sc.nextInt();
             int m2 = sc.nextInt();
              int m3 = sc.nextInt();

                total[i] = m1 + m2 + m3;
				
                 avg[i] = total[i] / 3.0;
        }

        System.out.printf("%-10s %-12s %-10s%n", "Roll No", "Total", "Average");
		
        for (int i = 0; i < 10; i++) {
			
            System.out.printf("%-10d %-12d %-10.2f%n", roll_no[i], total[i], avg[i]);
			
        }
		
		
    }
}
