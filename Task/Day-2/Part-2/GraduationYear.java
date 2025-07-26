import java.util.Scanner;
import java.util.Arrays;

public class GraduationYear{
    public static void main(String[] args) {
		
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};

        Arrays.sort(years);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of graduation: ");
        int gdYear = sc.nextInt();

        int first = 0; 
		int last = years.length - 1;
		
        boolean isfound = false;

        while ( first <= last) {
			
            int mid = (first + last) / 2;
			
            if (years[mid] == gdYear) {
                isfound = true;
                break;
				
            } else if (years[mid] < gdYear) {
				
                first = mid + 1;
				
            } else {
				
                last = mid - 1;
            }
        }

        if (isfound) {
            System.out.println("record exists");
        } else {
            System.out.println("record does not exist");
        }
    }
}
