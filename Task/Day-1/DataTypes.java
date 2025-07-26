
import java.util.Scanner;
 public class DataTypes{
 
 
     int intType = 300;
	 
	 double doubleType = 20.0;
	 
	 float floatType = 15.5f;
	 
	 long longType = 5743462332l;
	 
	 char charType = 'a';
	 
	 byte byteType =  126;
	 
	 
	 
	 public void  showAllTypes(){
		 
		 System.out.println("intValue : " + intType);
		 System.out.println("doubleValue : " + doubleType);
		 System.out.println(" floatValue : " + floatType);
		 System.out.println("longValue : " + longType);
		 System.out.println("charValue : " + charType);
		 System.out.println("byteValue : " + byteType);
	 }
 
 
 
 public  static void main(String[] args){
 
     DataTypes d = new DataTypes();
	 
	 d.showAllTypes();
   
   
 
 }
 } 
