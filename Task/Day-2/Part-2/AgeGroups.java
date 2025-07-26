import java.util.Scanner;

public class AgeGroups {

    public static void countPeopleAge(int[] ages) {
        int teen = 0, adults = 0, oldAge = 0;

        for (int i = 0; i < ages.length; i++) {
			
            if (ages[i] < 18) {
                teen++;
				
            } else if (ages[i] <= 60) {
                adults++;
				
            } else {
                oldAge++;
            }
			
        }

        System.out.println("Number of people <18: " + teen);
         System.out.println("Number of people between 18 and 60: " + adults);
          System.out.println("Number of people >60: " + oldAge);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 people:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }

            countPeopleAge(ages);
    }
}
