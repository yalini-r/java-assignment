
public class CharArrays {

    public static boolean isSame() {
		
        boolean isequal = true;

        char[] X = {'m', 'n', 'o', 'p'};
        char[] Y = {'m', 'n', 'o', 'p'};

        if (X.length != Y.length) 
            isequal = false;
		
        else {
            for (int i = 0; i < X.length; i++) {
				
                if (X[i] != Y[i]) {
                    isequal = false;
					
                    break;
                
				}
            }
        }

        return isequal;
    }

    public static void main(String[] args) {
		
		        if (isSame()) {
					
            System.out.println("The two char arrays are identical");
			
        } else {
			
            System.out.println("The two char arrays are not identical");
        }
    }
}
