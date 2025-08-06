class vechile{
    String brand;
    Boolean isAvailable;
    vechile(String brand,Boolean isAvailable){
        
        this.brand=brand;
        this.isAvailable=isAvailable;
    }
    public void getDetails(){
        System.out.println("the brand name is :"+ brand);
        System.out.println("the the vechile  isAvailable :"+ isAvailable);
    }

}
class car extends vechile{
    String carType,fuelType;
    
    car(String brand, boolean isAvailable,String carType,String fuelType){
        super(brand, isAvailable);
        this.carType=carType;
        this.fuelType=fuelType;
    }
    public void showCarInfo(){
        getDetails();
        System.out.println("the carType is :"+ carType);
        System.out.println("the car fueltype is : "+ fuelType);
    }


}
class Bike extends vechile{
    String bikeType;
    boolean hasHelmet;
    Bike(String brand, boolean isAvailable, String bikeType, boolean hasHelmet) {
        super(brand, isAvailable); // Call Vehicle constructor
        this.bikeType = bikeType;
        this.hasHelmet = hasHelmet;
    }

    public void showBikeInfo() {
        getDetails(); // Inherited method
        System.out.println("Bike Type: " + bikeType);
        System.out.println("Helmet Included: " + hasHelmet);
    }
}

public class demo3 {
    public static void main(String[] args){
        car car1 = new car("Toyota", true, "SUV", "Petrol");
        Bike bike1 = new Bike("Yamaha", false, "Sport", true);

        System.out.println(" Car Details:");
        car1.showCarInfo();

        System.out.println("\n Bike Details:");
        bike1.showBikeInfo();
    }
}
