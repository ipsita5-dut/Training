
package Inheritance;

public class Vehicle {

    String color;

    Vehicle(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle("Black");
        System.out.println(v.color);

        Bike b = new Bike("Red", "Yamaha", 150000);
        System.out.println("\nBike Details:");
        System.out.println(b.color);
        System.out.println(b.brand);
        System.out.println(b.price);

        Car c = new Car("White", "Honda", 1200000);
        System.out.println("\nCar Details:");
        System.out.println(c.color);
        System.out.println(c.brand);
        System.out.println(c.price);
    }
}

class Bike extends Vehicle {

    String brand;
    int price;

    Bike(String color, String brand, int price) {
       super(color);
        this.brand = brand;
        this.price = price;
    }
}

class Car extends Vehicle {

    String brand;
    int price;

    Car(String color, String brand, int price) {
        super(color);
        this.brand = brand;
        this.price = price;
    }
}

//package Inheritance;
//
//public class Vehicle {
//	String brand;
//	String color;
//	double price;
//	
//	public void printVehicle() {
//		System.out.println(brand);
//		System.out.println(color);
//		System.out.println(price);
//	}
//	
//	public static void main(String[] args) {
//		Bike b= new Bike("BMW", "Black", 150000);
//		b.printVehicle();
//		Vehicle v= new Vehicle();
//		v.brand= "Honda";
//		v.color= "Blue";
//		v.price= 100000;
//		
//		v.printVehicle();
//	}
//}
//
//class bike extends Vehicle{
//	
//	Bike(String brand, String color, double price){
//		this.brand=brand;
//		this.color=color;
//		this.price=price;
//	}
//}
