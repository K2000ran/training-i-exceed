class Sample {
    int s = 10;              // Instance variable
    static int y = 20;       // Static variable shared by all instances

    public void display() {
        // Instance method: can access both instance and static variables
        System.out.println("The s: " + s);  // Accessing instance variable
        System.out.println("The y: " + y);  // Accessing static variable
    }

    static void display1() {
        // Static method: can't access instance variables directly, must create object
        Sample s2 = new Sample();            // Creating object to access instance variable 's'
        System.out.println("The s: " + s2.s); // Accessing instance variable through object
        System.out.println("The y: " + y);    // Directly accessing static variable
    }
}

public class demost_M {
    public static void main(String[] args) {
        Sample s1 = new Sample();     // Creating object to call instance method
        s1.display();                 // Calling instance method to print values
        Sample.display1();           // Calling static method to demonstrate access pattern
    }
}
