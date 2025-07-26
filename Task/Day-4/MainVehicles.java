class Vehicle {
	 
    double milage;
    double price;

    Vehicle(double milage, double price) {
        this.milage = milage;
        this.price = price;
    }

      void displayDetails() {
        System.out.println("Milage: " + milage +
                "\nPrice: " + price);
       }
  }

 class Car extends Vehicle {
	  
		double ownershipCost;
		int warranty;
		int seatingCapacity;
		String fuelType;

    Car(double milage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
		
        super(milage, price);
		
        this.ownershipCost = ownershipCost;
         this.warranty = warranty;
         this.seatingCapacity = seatingCapacity;
          this.fuelType = fuelType;
    }

        void displayDetails() {
				super.displayDetails();
				System.out.println("Ownership Cost: " + ownershipCost +
						"\nWarranty: " + warranty +
						"\nSeating Capacity: " + seatingCapacity +
						  "\nFuel Type: " + fuelType);
         }
   }

class Audi extends Car {
    String modelType;

    Audi(double milage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
		
        super(milage, price, ownershipCost, warranty, seatingCapacity, fuelType);
		
        this.modelType = modelType;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Model Type: " + modelType);
      }
  }

class Ford extends Car {
    String modelType;

    Ford(double milage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
		
        super(milage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Model Type: " + modelType);
       }
}

 class Bike extends Vehicle {
    int cylinders;
    int gears;
    String coolingType;
    String wheelType;
    double fuelTankSize;

    Bike(double milage, double price, int cylinders, int gears, String coolingType, String wheelType, double fuelTankSize) {
		
        super(milage, price);
        this.cylinders = cylinders;
        this.gears = gears;
        this.coolingType = coolingType;
         this.wheelType = wheelType;
          this.fuelTankSize = fuelTankSize;
    }

      void displayDetails() {
        super.displayDetails();
        System.out.println("Cylinders: " + cylinders +
                "\nGears: " + gears +
                  "\nCooling Type: " + coolingType +
                   "\nWheel Type: " + wheelType +
                  "\nFuel Tank Size: " + fuelTankSize + " liters");
       }
}

class Bajaj extends Bike {
    String makeType;

    Bajaj(double milage, double price, int cylinders, int gears, String coolingType, String wheelType, double fuelTankSize, String makeType) {
        super(milage, price, cylinders, gears, coolingType, wheelType, fuelTankSize);
		
        this.makeType = makeType;
    }

      void displayDetails() {
		  
        super.displayDetails();
        System.out.println("Make Type: " + makeType);
      }
}

class TVS extends Bike {
    String makeType;

    TVS(double milage, double price, int cylinders, int gears, String coolingType, String wheelType, double fuelTankSize, String makeType) {
		
        super(milage, price, cylinders, gears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    void displayDetails() {
        super.displayDetails();
		
        System.out.println("Make Type: " + makeType);
      }
}

public class MainVehicles {
	
    public static void main(String[] args) {
		
        Audi myAudi = new Audi(15.0, 4500000.0, 50000.0, 4, 5, "Petrol", "A8");
        Ford myFord = new Ford(18.0, 3000000.0, 40000.0, 3, 5, "Diesel", "Endeavour");
        Bajaj myBajaj = new Bajaj(50.0, 90000.0, 1, 5, "Air", "Alloy", 12.0, "Pulsar");
        TVS myTVS = new TVS(55.0, 75000.0, 1, 4, "Liquid", "Spoke", 10.0, "Apache");

        System.out.println("------Audi Details-------");
        myAudi.displayDetails();

        System.out.println("\n-------Ford Details--------");
        myFord.displayDetails();

        System.out.println("\n-------Bajaj Details-------");
        myBajaj.displayDetails();

        System.out.println("\n--------TVS Details-----");
        myTVS.displayDetails();
		
		
    }
}
