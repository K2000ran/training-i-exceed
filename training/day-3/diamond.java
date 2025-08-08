interface A {
    default void greet() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from B");
    }
}

class C implements A, B {
    public void greet() {
        // Must override to resolve conflict
        A.super.greet(); // or B.super.greet()
        B.super.greet();
    }
}

public class diamond {
    public static void main(String[] args){
         C obj = new C();
        obj.greet();
    }
}
