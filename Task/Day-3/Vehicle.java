 public class Vehicle{
	 int vehicleId;
	 String brandName;
	 double price;
	 
	static int count =0;
	 
	 Vehicle(int vehicleId, String brandName ,double price){
		
		this.vehicleId =vehicleId;
		this.brandName = brandName;
		this.price = price;
		
		
		count++;
	 }
	 
	 public static void  showCountOfObjects(){
		    System.out.println("total created  vehicle objects  are : " + count );
	 }
	 
	 public static void main(String[] agrs){
		 
		
		 
		 Vehicle v1 = new Vehicle(101, "Honda" , 1500000);
		  Vehicle v2 = new Vehicle(102, "Tesla" , 5000000); 
		  Vehicle v3 = new Vehicle(102, "Ford" , 2000000);
		  
		 showCountOfObjects();
			  
			  
		 
	 }
 }