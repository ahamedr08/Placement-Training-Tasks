import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    // Field
    protected double speed; // Assuming a common speed for all vehicles

    // Constructor
    public Vehicle(double speed) {
        this.speed = speed;
    }

    // Method to calculate speed (to be overridden by subclasses)
    public double calculateSpeed() {
        return speed;
    }
}

// Subclass Car
class Car extends Vehicle {
    // Additional field
    private int passengers;

    // Constructor
    public Car(double speed, int passengers) {
        super(speed);
        this.passengers = passengers;
    }

    // Override calculateSpeed method to consider passengers
    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * passengers;
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    // Additional field
    private int wheels;

    // Constructor
    public Motorcycle(double speed, int wheels) {
        super(speed);
        this.wheels = wheels;
    }

    // Override calculateSpeed method to consider wheels
    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * wheels;
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for car speed and number of passengers
        System.out.print("Enter car speed: ");
        double carSpeed = scanner.nextDouble();
        System.out.print("Enter number of passengers in the car: ");
        int carPassengers = scanner.nextInt();

        // Create an instance of Car
        Car car = new Car(carSpeed, carPassengers);

        // Get user input for motorcycle speed and number of wheels
        System.out.print("Enter motorcycle speed: ");
        double motorcycleSpeed = scanner.nextDouble();
        System.out.print("Enter number of wheels on the motorcycle: ");
        int motorcycleWheels = scanner.nextInt();

        // Create an instance of Motorcycle
        Motorcycle motorcycle = new Motorcycle(motorcycleSpeed, motorcycleWheels);

        // Close the scanner to avoid resource leak
        scanner.close();

        // Call calculateSpeed and print details
        System.out.println("Car Details:");
        System.out.println("Speed: " + car.calculateSpeed());
        System.out.println(); // Blank line for readability

        System.out.println("Motorcycle Details:");
        System.out.println("Speed: " + motorcycle.calculateSpeed());
        System.out.println(); // Blank line for readability

        // Determine the vehicle with the highest effective speed
        if (car.calculateSpeed() > motorcycle.calculateSpeed()) {
            System.out.println("Car has the highest effective speed.");
        } else if (car.calculateSpeed() < motorcycle.calculateSpeed()) {
            System.out.println("Motorcycle has the highest effective speed.");
        } else {
            System.out.println("Both vehicles have the same effective speed.");
        }
    }
}
