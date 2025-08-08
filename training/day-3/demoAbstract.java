abstract class Animal {
    abstract void makeSound(); // abstract method
    void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
    void sleep(){
        System.out.println("dog is sleeping:");
    }
}
class cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("meow");
    }

    void sleep(){
        System.out.println("the cat is sleeping");
    }
}

class demoAbstract{
    public static void main (String []args){
        cat c1=new cat();
        c1.makeSound();
        c1.sleep();
        Dog D1=new Dog();
        D1.makeSound();
        D1.sleep();
    }
}