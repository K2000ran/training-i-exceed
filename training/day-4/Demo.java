class Student {
    private String name;
    private int age;

    //  Constructor to initialize values
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //  Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    //  Setter for age
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        //  Constructor initializes values
        Student s1 = new Student("Alice", 20);

        //  Get values
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        //  Update values using setters
        s1.setName("Bob");
        s1.setAge(22);

        //  Get updated values
        System.out.println("Updated Name: " + s1.getName());
        System.out.println("Updated Age: " + s1.getAge());
    }
}

