import java.util.Scanner;

public class Variables {

//static variable
    static String shopName = "Grandmart";
	
// instance variable	
    int productId;
    String productName;
    double productPrice;
	
//final	
	
final String country = "India";


    public double cartTotal(double pdPrice) {
		
		//local variable
        double totalPrice = pdPrice;
        if (totalPrice > 10000) {
			//block variable
            int discount = 2500;
            totalPrice -= discount;
        }
        return totalPrice;
    }

    public void showProductDetails(String sp, int pid, String pname, double pprice, double tp , String c) {
        System.out.println(
            "ShopName: " + sp + "\n" +
            "Product ID: " + pid + "\n" +
            "Product Name: " + pname + "\n" +
            "Price: " + pprice + "\n" +
            "TotalPrice : " + tp + "\n" +
			"country : " + c
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        Variables v = new Variables();

          System.out.println("Enter product details");
		  
        System.out.print("Enter product id: ");
        v.productId = sc.nextInt();

        System.out.print("Enter product name: ");
        v.productName = sc.next();

        System.out.print("Enter product price: ");
        v.productPrice = sc.nextDouble();

        double tp = v.cartTotal(v.productPrice);
		
         System.out.println("show product details");
			
        v.showProductDetails(shopName, v.productId, v.productName, v.productPrice, tp , v.country);
    }
}
