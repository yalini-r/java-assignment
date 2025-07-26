import java.util.Scanner;

class BasicCaluclator {

    void add(int a, int b) {
        System.out.println("result of sum : " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("result of subtract : " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("result of multiply : " + (a * b));
    }

    void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
        } else {
            System.out.println("result of divide : " + (a / b));
        }
    }
}

class AdvancedCalculator extends BasicCaluclator {

    void power(int base, int exp) {
        System.out.println("result of power : " + Math.pow(base, exp));
    }

    void modulus(int a, int b) {
        System.out.println("result of modulus : " + (a % b));
    }

    void squareRoot(double number) {
        System.out.println("result of squareRoot : " + Math.sqrt(number));
    }
}

class ScientificCalculator extends AdvancedCalculator {

    void sin(double angle) {
        System.out.println("result of sin : " + Math.sin(angle));
    }

    void cos(double angle) {
        System.out.println("result of cos : " + Math.cos(angle));
    }

    void log(double value) {
        System.out.println("result of log : " + Math.log(value));
    }

    void exp(double value) {
        System.out.println("result of exp : " + Math.exp(value));
    }
}

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        while (true) {
			
            System.out.println("\nChoose Operations");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.println("5. Power\n6. Modulus\n7. Square Root");
            System.out.println("8. Sine\n9. Cos\n10. Log\n11. Exponential");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
              case 1:
                   System.out.print("Enter two numbers for add : ");
                    calc.add(sc.nextInt(),  sc.nextInt());
                    break;
					
               case 2:
                  System.out.print("Enter two numbers for sub : ");
                    calc.subtract(sc.nextInt(), sc.nextInt());
                    break;
					
               case 3:
                    System.out.print("Enter two numbers for multiple : ");
                    calc.multiply(sc.nextInt(), sc.nextInt());
                     break;
					
                case 4:
                   System.out.print("Enter two numbers for divide: ");
                    calc.divide(sc.nextInt(), sc.nextInt());
                    break;
					
                 case 5:
                    System.out.print("Enter base and exp for power : ");
                     calc.power(sc.nextInt(), sc.nextInt());
                      break;
					
               case 6:
                    System.out.print("Enter two numbers modulus : ");
                     calc.modulus(sc.nextInt(), sc.nextInt());
                      break;
					  
					  
                case 7:
                    System.out.print("Enter a number for squreroot : ");
                    calc.squareRoot(sc.nextDouble());
                    break;
					
					
                case 8:
                   System.out.print("Enter angle in radians for sin: ");
                    calc.sin(sc.nextDouble());
                    break;
					
               case 9:
                    System.out.print("Enter angle in radians for cos : ");
                    calc.cos(sc.nextDouble());
                     break;
					
                case 10:
                   System.out.print("Enter a number for log : ");
                    calc.log(sc.nextDouble());
                    break;
					
                case 11:
                   System.out.print("Enter a number for exp : ");
                     calc.exp(sc.nextDouble());
                     break;
					 
					 
                case 0:
                    System.out.println("Exited from calculator");
                    sc.close();
                   
					
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
