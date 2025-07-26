
import java.util.Scanner;
public class Employee {

    int empId;
     String empName;
     double empSalary;
     String empDept;
     String companyName;

    // Constructor
    public Employee(int empId, String empName, double empSalary, String empDept, String  companyName) {
        this .empId = empId;
         this.empName = empName;
          this.empSalary = empSalary;
          this.empDept = empDept;
          this.companyName = companyName;
    }

   
    public void displayEmpDetails() {
        System.out.println("--------- Employee Details ------------");
         System.out.println("ID: " + empId + "\n" +
                            "Name: " + empName +  "\n" +
                             "Salary: " + empSalary +  "\n" +
                             "Dept: " + empDept +  "\n" +
                              "Company: " + companyName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      System.out.println("Enter Employee details");

        System.out.print("Enter Employee Id: ");
        int e_id = sc.nextInt();
        sc.nextLine();

         System.out.print("Enter Employee Name: ");
           String e_name = sc.nextLine();

         System.out.print("Enter Employee Salary: ");
          double e_sal = sc.nextDouble();
            sc.nextLine();

        System.out.print("Enter Employee Dept: ");
            String e_dpt = sc.nextLine();

        System.out.print("Enter Company Name: ");
            String c_name = sc.nextLine();

        // Create Employee object
       Employee emp = new Employee(e_id, e_name, e_sal, e_dpt, c_name);

            emp.displayEmpDetails();
    }
}
