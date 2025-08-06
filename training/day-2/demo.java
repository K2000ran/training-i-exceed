class Sample {
    
    Sample(String name) {
        System.out.println("The dog name is: " + name);
    }
    void display(int x){
        System.out.println("the value of x: " + x*x);
    }
}

class Animal extends Sample {
    Animal() {
        super("Tommy");//calling the parent class constructor
        super.display(5);//assigning the value to parent class   in parent method
        System.out.println("This is child class");

    }
}


class demo {
    public static void main(String[] args) {
        Animal a = new Animal();
}
}
