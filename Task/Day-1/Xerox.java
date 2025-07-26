

class  Employee {

   int empId;
   String empName;
   
   public Employee( int empId ,  String empName){
   
      this.empId = empId;
	  this.empName = empName;
	 
   
   }
   
   
}

class Company {
	
	String comName;
     String comLocation;
   
  
	
}

public class Xerox{
	
	
	public  void checkInstanceOf(Employee emp ,Company cmp ){
		
   if( emp instanceof Employee ){
	   
	    System.out.println("emp object is instance of Employee class");
   }else {
	    System.out.println("emp object is not instance of Employee class");
   }  
	if(cmp instanceof  Company){
		
	   System.out.println("cmp object is instance of Company class");
	}else{
		
	    System.out.println("cmp object is not  instance of Employee class");
	}
	
		
	}
	
	public static void main(String[] args){
		
		Employee emp = new Employee(101, "Yalini");
		
		 Company cmp = null;
		
		 Xerox  x = new Xerox();
	     x.checkInstanceOf( emp , cmp);
		
	}
	
}