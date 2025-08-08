class Example {
    // Instance method
    void instanceGreet() {
        System.out.println("Hello from the instance method!");
    }

    // Static method
    static void staticGreet() {
        System.out.println("Hello from the static method!");
    }
}

public class Demoo {
    public static void main(String[] args) {
        // Calling static method: directly with class name
        Example.staticGreet();  //  No need to create an object

        // Calling instance method: requires object creation
        Example obj = new Example();
        obj.instanceGreet();    //  Object needed
    }
}

