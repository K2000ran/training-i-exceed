class sample{
static int x;//  Static variable: shared across all instances of the class
sample(){
    x++;
    System.out.println(x);
}
}
public class demoStatic {
    public static void main(String[] args){
        
        sample s=new sample();//1
        sample s1=new sample();//2
        sample s2=new sample();//3
    }
}
