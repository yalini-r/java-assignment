public class Employee{

int employeeId;
 String employeeName;
 String designation;
 double salary;
 
 //zero argument constructor and set values default
 Employee(){
	 
	 System.out.println("object has been created");
	 
	 int employeeId =0;
	 String employeeName = null;
	 String designation = null;
	 double salary = 0.0;
 }
 //parametrized constructor and value are seted
 Employee( int employeeId, String employeeName, String designation ,double salary ){
	  
	  this.employeeId = employeeId;
	  this.employeeName = employeeName;
	  this.designation = designation;
	  this.salary = salary;
  }
  
  // copy constructor takes existing emp object 
  Employee(Employee emp){
	  this.employeeId = emp.employeeId;
	  this.employeeName = emp.employeeName;
	  this.designation = emp.designation;
	  this.salary = emp.salary;
	  
  }
  
  public void showDetails() {
        System.out.println("Employee Name: " + employeeName+ 
                           "\nEmployee ID: " + employeeId +
                           "\nDesignation: " + designation +
                           "\nSalary: " + salary);
       
    }

 
 public static void main(String[] args){
	 
	 Employee emp1 = new Employee();
	 System.out.println("---------Employee 1 details-----------");
	  emp1.showDetails();
	 
	 Employee emp2 = new Employee(101 , "james" , "UI/UX Desinger" , 20000 );
	 System.out.println("------------------Employee 2 details------------");
	   emp2.showDetails();
	 
	 Employee emp3 = new Employee(emp2);
	  System.out.println("----------------Employee 3 details----------------");
	   emp3.showDetails();
	 
	 
	  
	  }



}