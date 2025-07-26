public class PatternWhileLoop {
	
	  public  static void printNumbers() {
              int num = 1;
        int n = 3;
            int r=1;
            while(r<=2*n-1){
                int e = r > n ? 2 * n - r : r;       
                int space = n - e; 
                
                int s =1;
                while(s<=space){
                System.out.print("  ");  
                s++;
                }
                int c=1;
                while(c<=e){
                System.out.print(num++ + "   "); 
                c++;
                }
                System.out.println();
                r++;
  }
	
    }
	
	  public static void printW() {
		
        int[] w = {1, 2, 3, 2, 1};
		
        int i = 0;
		
        while (i < w.length) {
		  int j = 0;
		  
            while (j < w[i]) {
                System.out.print("w ");
                j++;
            }
			
            System.out.println();
            i++;
        }
    }


    public static void main(String[] args) {
		
		printNumbers();
		
        printW();
    }
}