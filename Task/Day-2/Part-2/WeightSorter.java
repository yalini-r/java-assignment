import java.util.Scanner;

public class WeightSorter {

    public static void sortWeight(double[] weights) {
	
        for (int i = 0; i < weights.length - 1; i++) {
            int max = i;
			
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[j] > weights[max]) {
                    max = j;
					
                }
				
            }
           
            double temp = weights[i];
            weights[i] = weights[max];
            weights[max] = temp;
			
        }

        System.out.println("Weights in descending order:");
		
        for (double weight : weights) {
            System.out.print(weight + " ");
			
        }
		
    }

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		

        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        double[] weights = new double[size];

        System.out.println("Enter weights of " + size + " people:");
        for (int i = 0; i < size; i++) {
			
            System.out.print("Enter weight " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
        }

        sortWeight(weights);
    }
}
