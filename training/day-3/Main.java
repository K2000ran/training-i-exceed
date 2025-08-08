// Address class


// Employee class
class Employee {
    int id;
    String name;
    Address address; // HAS-A relationship

    // Constructor
    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Display method
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.displayAddress(); // Using the Address class method
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an Address object
        Address addr = new Address("123 MG Road", "Bangalore", "Karnataka", "560001");

        // Create an Employee object with the Address
        Employee emp = new Employee(101, "Rahul Sharma", addr);

        // Display Employee details
        emp.displayEmployee();
    }
}