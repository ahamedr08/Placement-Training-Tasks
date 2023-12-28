public class ConstructorExample {

    // No-argument constructor
    public ConstructorExample() {
        System.out.println("No-argument constructor called");
    }

    // Default constructor
    public ConstructorExample(String message) {
        System.out.println("Default constructor called with message: " + message);
    }

    // Parameterized constructor with different types of parameters
    public ConstructorExample(int number) {
        System.out.println("Parameterized constructor called with an integer: " + number);
    }

    public ConstructorExample(String name, int age) {
        System.out.println("Parameterized constructor called with name: " + name + " and age: " + age);
    }

    public static void main(String[] args) {
        
        // Creating objects using different constructors
        ConstructorExample obj1 = new ConstructorExample(); // No-argument constructor
        ConstructorExample obj2 = new ConstructorExample("Hello, constructors!"); // Default constructor
        ConstructorExample obj3 = new ConstructorExample(42); // Parameterized constructor with an integer
        ConstructorExample obj4 = new ConstructorExample("Ahamed", 20); // Parameterized constructor with string and integer
    }
}
