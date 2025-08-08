class Animal{
    
    public void Eat(){
        System.out.println("The Animal is eating :");
    }
}
class Dog extends Animal{
    @Override
    public void Eat(){
        System.out.println("The dog is eating :meat");
    }
}
class cat extends Animal{
    @Override
    public void Eat(){
        System.out.println("The cat is eating :milk ");
    }
}
class cow extends Animal{
    @Override
    public void Eat(){
        System.out.println("The cow is eating : grass");
    }
}

public class demooride {
    public static void main(String[] args){
        Animal a;// run time polymorpism  method overriding
     a=new Animal();
     a.Eat();
    a = new Dog();
    a.Eat();
     a = new cat();
    a.Eat();
     a = new cow();
    a.Eat();
    }

}
