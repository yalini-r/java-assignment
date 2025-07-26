
public class Student1{

   int roll_no;
   String name;
   
  public Student1(int roll_no ,String name){
   this.roll_no = roll_no;
   this.name = name;
  }
  
  public void showDetails(){
	  
	     System.out.println("Roll No: " + roll_no + "\nName: " + name);
	  
  }
  
  public static void main(String[] args){

     Student1 s1 = new Student1(101, "princy");
     s1.showDetails();
}

} 