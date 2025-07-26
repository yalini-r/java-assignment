
import java.util.Scanner;
public class GradeOfStudent{
	
	public static void checkWithIf(int percent){
		
		if(percent>=85 && percent<=100){
			System.out.println("Grade A");
		}else if(percent >=70){
			System.out.println("Grade B");
		}else if(percent >=50){
			System.out.println("Grade C");
		}else {
			System.out.println("fail");
		}
	}
	
	public static void checkWithSwitch(int percent){
		
		      switch(percent/10){
			  case 10:
			  case 9:
			  case 8:
			       System.out.println("Grade A");
				   break;
			  case 7:
			         System.out.println("Grade B");
				     break;
		      case 6:
			  case 5:
			         System.out.println("Grade C");
				     break;
					 
				default :
                    System.out.println("fail");				
				
 			  
		  }
		
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter your  percentage: ");
        int per = sc.nextInt();
		
		checkWithIf(per);
		checkWithSwitch(per);
	}


}