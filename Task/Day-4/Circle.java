import java.util.Scanner;
class Point{

  private int x;
  private int y;
   
   Point(){
	     x=0;
		 y= 0;
	   
   }
   
   //setter --> Mutator
  public void setPoint(int x , int y){
	    this.x =x;
		this.y =y;
	   
   }
   
   //getter -->Accessor
   public int getX(){
	   return x ;
	   
	   
   }
   
   public int getY(){
	   return y;
   }
   
   
   
  }
  
  
 public class Circle extends Point{
	  
	 private  double radius ;	
	final static double pi=3.14;
    
     //cons	
	public Circle(){}
	
	//set method
	public void setRadius(double radius){
	  if(radius >=0)
		  this.radius = radius;
		else 
			this.radius =1;
			  
    }
	
	//get method
	public double getRadius(){
		return  radius;
	}
	
	//area of circle
	
	public double findArea(){
	 System.out.println("Radius is " + getRadius());
		
		return pi * Math.pow(radius , 2);
		
		
	}
	//display data
	 public void display(){
       
       System.out.println( "Circle center is "  + "(" + getX()+ ","+ getY() + ")");
   }
     
 public static void main(String[] args){
	 
     Scanner sc = new Scanner(System.in);
	   Circle c = new Circle();
	   
	     //inputs.....
		//get circle center 
	   System.out.print("Enter 	x  : " );
		int x = sc.nextInt();
	   System.out.print("\nEnter y : " ); 
		int y = sc.nextInt();
	   
	    c.setPoint(x , y);
		
		//get circle  radius
	    System.out.print("\nEnter  radius : ");
		double radius =   sc.nextDouble();
		c.setRadius(radius);
		
		//outputs.....
		//invoking the methods  
		c.display();
		
		double area = c.findArea();
		
		System.out.println("Area is " + area);
		
			
			
        sc.close();
	}		
	  
  }
  
