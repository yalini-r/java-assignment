public class Student12{

   int roll_no;
   String name;
   long phone_no ;
   String address;   
   
  public Student12(int roll_no ,String name, long phone_no ,  String address){
   this.roll_no = roll_no;
   this.name = name;
   this.phone_no = phone_no;
   this.address = address;
  }
  

  public void showDetails(){
	 
	  
	  System.out.println("-------------Student-------------" );
	     System.out.println("Roll No: " + roll_no +
 		                    "\nName: " + name +
							"\nphone no: "+ phone_no +
							"\naddress : "+ address);
	  
  }
  
  public static void main(String[] args){

      Student12 s1 = new Student12(101, "Sam" , 7569376291l, "annagar ,chennai");
	  s1.showDetails();
	  Student12 s2 = new Student12(102 , "John" , 9879274872l , "n.g.o colony, guduvancheri");
      s2.showDetails();
}

} 