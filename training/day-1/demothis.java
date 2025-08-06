class Student {
    String name, dept, college;
    int age;

    // Constructor with 3 parameters
    Student(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    // Constructor with 4 parameters, using constructor chaining
    Student(String name, int age, String dept, String college) {
        this(name, age, dept); // Calls the 3-parameter constructor
        this.college = college;

        System.out.println(college);
        this.displayStudent();
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Hi " + name + ", you are " + age + " years old, belong to " + dept + " department, from " + college + ".");
    }
}

class demothis {
    public static void main(String[] args) {
        Student obj = new Student("x", 32, "CSE", "GCT");
    }
}
