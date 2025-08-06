class sample{
    sample(){
        System.out.println("this is constructor");
        this.display();
        System.out.println("this is the method : "+this);
    }
    public void display(){
        System.out.println("This is method");
    }
}

public class stu {
    public static void main(String[] args){
        sample s=new sample();
        System.out.println("this is the address : "+s);
        
}
}
