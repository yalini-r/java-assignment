import java.util.ArrayList;

class Product {
    int productId;
    String productName;
    double productPrize;
    int quantity;

    public Product(int productId, String  productName, double productPrize, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrize = productPrize;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("Product ID     : " + productId +
                           "\nProduct Name   : " + productName+
                           "\nProduct Price  : " + productPrize +
                           "\nQuantity       : " + quantity);
						   
						    System.out.println("------------------");
    }
}



class Store {
    static String storeName;
   static String storeLocation;
	
    private ArrayList<Product> products = new ArrayList<>();

  
    public static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
     }

   
     public static void displayStoreDetails() {
		    
        System.out.println("Store Name     : " + storeName +
                            "\nStore Location : " + storeLocation);
      
       }

  
      public void addProduct(Product product) {
		  
        products.add(product);
      }

   
       public void displayAllProducts() {
		
        System.out.println("All Products in Store:");
       
        for (Product p : products) {
            p.displayProduct();
        }
    }
	
  }

 public class Shop {
	 
    public static void main(String[] args) {
       
        Store.setStoreDetails("D Mart", "Madurai");
		Store.displayStoreDetails();

         Store myStore = new Store();

        Product p1 = new Product(101, "Milk", 45.50, 30);
        Product p2 = new Product(102, "Bread", 30.00, 50);
        Product p3 = new Product(103, "Eggs", 6.00, 100);

        myStore.addProduct(p1);
        myStore.addProduct(p2);
        myStore.addProduct(p3);

        myStore.displayAllProducts();
    }
}
