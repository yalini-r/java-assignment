public class Employee123{
    String empName;
    int yearOfJoining;
    String address;
	
	static int count = 0;
	Employee123(String empName, int yearOfJoining, String address) {
        this.empName = empName;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
		
		count++;
    }
	
	void display() {
	   
	   
	   System.out.println("-----------Employee details--------------");
		
        System.out.format("%-10s %-20d %s\n", empName, yearOfJoining, address);
    }
	
	
	  public static void main(String[] args) {
		  
		  
		   //format method to align from left side
        System.out.format("%-10s %-20s %s\n", "Name", "Year of joining", "Address");
      
        Employee123 e1 = new Employee123("Robert", 1994, "64C- WallsStreat");
		e1.display();
        Employee123 e2 = new Employee123("Sam", 2000, "68D- WallsStreat");
		 e2.display();
        Employee123 e3 = new Employee123("John", 1999, "26B- WallsStreat");
          e3.display();
       
        
     }
	
	}