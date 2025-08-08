class calculation{
    
    public void add(int x,int y){
        System.out.println("The sum of two number is :"+ (x+y));
    }
    public void add(String s){
        System.out.println("this is add function wiht String: "+ s);
    }
    public String add(String a,String k){
        String s=a + " " + k;
        return s;
    }
}
public class demoMethodOverloading {
    public static void main(String [] args){
        calculation c1=new calculation();
        c1.add(12 ,10);
        c1.add("kiran");
        String k=c1.add("Java prohraming","love");
        System.out.println(k);
    }
}
