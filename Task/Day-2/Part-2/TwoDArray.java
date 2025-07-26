
import java.util.Scanner;

public class TwoDArray{
	
  public static int[][] inputElements(int m , int n , Scanner sc){
		
		int matrix[][] = new int[m][n];
		
			System.out.println("enter a elements at matrix  ");
		for(int i=0; i< m ; i++){
			for(int j=0; j< n ; j++){
			System.out.print("enter a element at [ " + i +" ]" + "[ " + j + " ]:");
				matrix[i][j] = sc.nextInt();
			}
			
		}
		
		
		return matrix;
		
	}
	
	
	public static void displayElements(int matrix[][]){
		
		
		System.out.println(" elements at matrix  ");
		
		for(int i=0; i< matrix.length ; i++){
			for(int j=0; j< matrix[0].length ; j++){
			
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void sumOfAllElements(int matrix[][]){
		int sum =0;
		
		for(int i=0; i< matrix.length ; i++){
			for(int j=0; j< matrix[0].length ; j++){
			
				sum +=matrix[i][j];
			}
			
		}
		
		System.out.println("sum of all elemnts in 2d array are : " + sum);
		
	}
	
	public static void sumRowWise(int matrix[][]){
		
		
		for(int i=0; i< matrix.length ; i++){
			int sumRow =0;
			for(int j=0; j< matrix[0].length ; j++){
			
				sumRow +=matrix[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + ": " + sumRow);
		}
		
	}


    public static void sumColumnWise(int matrix[][]){
		
		for(int j=0; j< matrix[0].length ; j++){
			int sumColumn =0;
			for(int i=0; i< matrix.length ; i++){
			
			          sumColumn +=matrix[i][j];
			}
		System.out.println("Sum of column " + (j + 1) + ": " + sumColumn);
		}
		
	}
	
	public static void transposeElements(int m , int n , int matrix[][] ){
		
		int transpose[][] = new int[n][m];
		
			System.out.println("enter a elements at transpose from mstrix ");
		for(int i=0; i< m ; i++){
			for(int j=0; j< n ; j++){
			System.out.print("enter a element at [ " + i +" ]" + "[ " + j + " ]: from matrix array");
				transpose[j][i] = matrix[i][j];
			}
			
		}
		
		System.out.println("elements at transpose");
		
			for(int i=0; i< m ; i++){
			for(int j=0; j< n ; j++){
			
			
			System.out.print(transpose[i][j]+ "\t");
				
			}
			System.out.println();
		}
		
		
	}

 public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter a size of row : ");
	int m = sc.nextInt();
	
	System.out.print("enter a size of column : ");
	int n = sc.nextInt();
	
	
	int matrix[][] = inputElements(m , n , sc );
	
	displayElements(matrix);
	sumOfAllElements(matrix);
	sumRowWise(matrix);
	sumColumnWise(matrix);
	transposeElements(m , n, matrix);
	
	}

}