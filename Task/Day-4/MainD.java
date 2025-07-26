
class TwoD{

  private double x ;
  private double y;
   
    // Default cons
    public TwoD() {
      
        System.out.println("TwoD default constructor");
    }
	
	
	 // Cons with two args
     public TwoD(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("TwoD constructor with two arguments");
      }
   

   
   // Set method 
     public void setX(double x) {
        this.x = x;
      }

      public void setY(double y) {
        this.y = y;
     }
	 
	   // Get
     public double getX() {
        return x;
     }

      public double getY() {
        return y;
    }

    
}

 class ThreeD  extends  TwoD{
 
 private double z;
     
    // Default cons
       public ThreeD() {
       super();
      
      }

    // Cons with three args
    public ThreeD(double x, double y, double z) {
        super(x, y); 
        this.z = z;
    }
	
	 public void setZ(double z) {
        this.z = z;
     }
   
       
   public double getZ() {
        return z;
    }

     
   public double  findDistance(ThreeD td){
	   
	   x = td.getX() - this.getX();
	   y = td.getY() - this.getY();
	   z = td.getZ() - this.getZ();
	   //x = x1-x2 -->  x*x 
	 double sq = Math.sqrt(x*x + y*y + z*z);
	   
	   return Math.round(sq);
   }
 
 }
 
 
 public class MainD{
	
 public static void main(String[] args){
    
	 //create obj --> passing data via set method
	 ThreeD  th = new ThreeD();
	 th.setX(2.4);
	 th.setY(2.0);
	 th.setZ(1.5);
	 
	 //create obj --> passing data via cons
	 ThreeD th1 = new ThreeD(3.5 , 2.3, 2.0);
	 
	 //distance btw  diff datas 
	 double sq = th.findDistance(th1);
	 
	 System.out.println("distance of two threeD Points: " + sq);
	 
 }	 
	 
	 
 }
