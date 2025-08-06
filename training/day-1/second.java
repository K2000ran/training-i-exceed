class sample{
    sample(){
        System.out.println("This is the default constructor");
    }
    sample(int x,int y){
        System.out.println(x*y);
    }
    sample(String st){
        System.out.println(st);
    }
}

public class second {
    public static void main(String[] args){
        sample obj=new sample();
    
        sample obj2 =new sample(10,20);
        sample obj3=new sample("this is string");
    }
}
