class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void updateAge(int newAge) {
        this.age = newAge;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();

        s1.updateAge(25);
        s1.display();

        s1.name = "Bob";
        s1.display();
    }
}

