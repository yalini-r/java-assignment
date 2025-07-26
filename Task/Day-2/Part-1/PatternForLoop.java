import java.util.Scanner;

public class PatternForLoop {
	
	public static void doXPattern(){
		System.out.println("--------------------Pattern X-------------------");
		 int size = 5;
		
		for (int i = 1; i <= size; i++) {
			
            for (int j = 1; j <= size; j++) {
				
                if (i == j || (i + j) == size + 1) {
                    System.out.print("1");
					
                } else {
                    System.out.print(" ");
                }
				
            }
            System.out.println();
        }
	}
	
	public static void doRPattern(){
		
		System.out.println("--------------------Pattern R-------------------");
		int rows = 5;
        int cols = 4;
      
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
               
                if (j == 1) {
                    System.out.print("R ");
                }
                
                else if (i == 1) {
                    System.out.print("R ");
                }
                
                else if (i == 3 && j < cols) {
                    System.out.print("R ");
                }
               
                else if (j == cols && i == 2) {
                    System.out.print("R ");
                }
               
                else if (i == 4 && j == 3 || i == 5 && j == 4) {
                    System.out.print("R ");
                }
               
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	}
	
    public static void main(String[] args) {
        

        doXPattern();
		
		doRPattern();
        
    }
}
