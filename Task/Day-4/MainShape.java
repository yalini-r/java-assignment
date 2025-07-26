class Shape{

  //default
  void printMsg(){
   
        System.out.println("This is a shape");
   }


}
class Polygon extends Shape{
	
	@Override
	protected void printMsg (){
		super.printMsg();
		System.out.println("This is a polygon");
		
	}
	
}


class Triangle extends Polygon{
	@Override
	public void printMsg (){
		
		System.out.println("Triangle is a polygon");
		
	}
	
}

class Rectangle extends Polygon{
	@Override
	protected void printMsg (){
		//access immediate parent class properties
		super.printMsg();
		System.out.println("Rectangle is a polygon");
		
	}
	
}

class Square extends Rectangle {
	@Override
  public void printMsg (){
	   super.printMsg();
		System.out.println("Square is a Rectangle");
		
	}
}

public class MainShape{

	public static void main(String[] args){
		
		
		Square s = new Square();
		s.printMsg();
		Triangle t = new Triangle();
		t.printMsg();
		
		
	}
	
}
